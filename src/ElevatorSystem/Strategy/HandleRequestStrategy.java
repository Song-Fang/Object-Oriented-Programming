package ElevatorSystem.Strategy;

import ElevatorSystem.Elevator;

import java.util.List;

public interface HandleRequestStrategy {
    //default privilege is public
     Elevator handleRequestStrategy(List<Elevator> elevators);
}
