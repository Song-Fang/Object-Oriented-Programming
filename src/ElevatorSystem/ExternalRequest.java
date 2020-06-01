package ElevatorSystem;

public class ExternalRequest {
    private int currentLevel;
    private Direction direction;

    public ExternalRequest(int currentLevel,Direction direction){
        this.direction = direction;
        this.currentLevel = currentLevel;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public Direction getDirection() {
        return direction;
    }
}
