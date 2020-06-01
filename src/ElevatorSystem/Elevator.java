package ElevatorSystem;

import ElevatorSystem.Exception.ExceedWeightException;
import ElevatorSystem.Exception.InvalidExternalRequestException;
import ElevatorSystem.Exception.InvalidInternalRequestException;
import ElevatorSystem.Exception.InvalidLevelIndexException;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Elevator {
    private List<Button> buttons;
    private int curtLevel;
    private int maxWeight;
    private int MAX_LEVEL;
    private int MIN_LEVEL;
    private Status status;
    private PriorityQueue<Integer> upStops;
    private PriorityQueue<Integer> downStops;

    public Elevator(int top, int curtLevel){
        MIN_LEVEL = 1;
        MAX_LEVEL = top;
        status = Status.IDLE;
        this.curtLevel = curtLevel;

        buttons = new ArrayList<Button>();
        for(int i =1;i<=top;i++){
            buttons.add(new Button(this,i));
        }
        upStops = new PriorityQueue<>();
        downStops= new PriorityQueue<>((a,b)->Integer.compare(b,a));
        maxWeight = 1000;
    }

    //use case 1 handleExternalRequest
    public void handleExternalRequest(ExternalRequest externalRequest) throws InvalidExternalRequestException {
        int externalLevel = externalRequest.getCurrentLevel();
        if(externalRequest.getDirection()==Direction.UP&&status==Status.UP&&externalLevel>=curtLevel){
            upStops.offer(externalLevel);
        }

        if(externalRequest.getDirection()==Direction.DOWN&&status==Status.DOWN&&externalLevel<=curtLevel){
            downStops.offer(externalLevel);
        }
    }

    //Use case 2 move
    public void move(int level){

        if(level>MAX_LEVEL||level<MIN_LEVEL){
            throw new InvalidLevelIndexException();
        }
        this.curtLevel = level;
    }

    //Use case 3 handleInternalRequest
    public void handleInternalRequest(InternalRequest internalRequest) throws InvalidInternalRequestException {
        if(!isInvalidInternalRequest(internalRequest)){
            throw new InvalidInternalRequestException();
        }
        if(status==Status.UP){
            upStops.offer(internalRequest.getDestination());
        }

        if(status==Status.DOWN){
            downStops.offer(internalRequest.getDestination());
        }
    }

    //User case 4 open gate
    public void openGate(){
        if(status==Status.UP){
            upStops.poll();
        }

        if(status==Status.DOWN){
            downStops.poll();
        }
    }

    //User case 5 close gate
    public void closeGate(int weight){
        if(!checkWeight(weight)){
            throw new ExceedWeightException();
        }

        if (status == Status.UP) {
            if (!upStops.isEmpty()) {
                move(upStops.peek());
                openGate();
            } else if (!downStops.isEmpty()) {
                status = Status.DOWN;
                move(downStops.peek());
                openGate();
            } else {
                status = Status.IDLE;
            }
        } else if (status == Status.DOWN) {
            if (!downStops.isEmpty()) {
                move(downStops.peek());
                openGate();

            } else if (!upStops.isEmpty()) {
                status = Status.UP;
                move(upStops.peek());
                openGate();
            } else {
                status = Status.IDLE;
            }
        } else {
            if (!downStops.isEmpty()) {
                status = Status.DOWN;
                move(downStops.peek());
                openGate();

            } else if (!upStops.isEmpty()) {
                status = Status.UP;
                move(upStops.peek());
                openGate();
            }
        }
    }

    private boolean checkWeight(int weight){
        if(weight>maxWeight){
            return false;
        }
        return true;
    }


    private boolean isInvalidInternalRequest(InternalRequest internalRequest){
        int destination = internalRequest.getDestination();
        if(status==Status.UP&&destination>curtLevel){
            return true;
        }

        if(status==Status.DOWN&&destination<curtLevel){
            return true;
        }
        return false;
    }
}
