package ElevatorSystem.Strategy;

import ElevatorSystem.Elevator;

import java.util.List;

public class PeakTimeStrategy implements HandleRequestStrategy{

     public Elevator handleRequestStrategy(List<Elevator> elevators) {
        return elevators.get(0);
    }
}
