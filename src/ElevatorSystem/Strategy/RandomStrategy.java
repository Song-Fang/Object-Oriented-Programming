package ElevatorSystem.Strategy;

import ElevatorSystem.Elevator;

import java.util.List;
import java.util.Random;

public class RandomStrategy implements HandleRequestStrategy{
    @Override
    public Elevator handleRequestStrategy(List<Elevator> elevators) {
        Random random = new Random();
        int index = random.nextInt(elevators.size());

        return elevators.get(index);
    }
}
