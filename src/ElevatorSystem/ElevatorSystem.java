package ElevatorSystem;

import ElevatorSystem.Exception.InvalidExternalRequestException;
import ElevatorSystem.Strategy.HandleRequestStrategy;

import java.util.List;

public class ElevatorSystem {
    HandleRequestStrategy strategy;
    List<Elevator> elevators;

    public ElevatorSystem(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void setStrategy(HandleRequestStrategy strategy) {
        this.strategy = strategy;
    }

    public void handlExternalRequest(ExternalRequest externalRequest) throws InvalidExternalRequestException {
        Elevator elevator = strategy.handleRequestStrategy(elevators);
        elevator.handleExternalRequest(externalRequest);
    }
}
