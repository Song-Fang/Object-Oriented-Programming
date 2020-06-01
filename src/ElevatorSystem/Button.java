package ElevatorSystem;

import ElevatorSystem.Exception.InvalidInternalRequestException;

public class Button {
    private Elevator elevator;
    private int level;

    public Button(Elevator elevator, int level){
        this.elevator = elevator;
        this.level = level;
    }

    public void pressButton (InternalRequest internalRequest) throws InvalidInternalRequestException {
        elevator.handleInternalRequest(internalRequest);
    }
}
