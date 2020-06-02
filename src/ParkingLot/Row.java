package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Row {
    List<Spot> spots;

    public Row(int n){
        while(n>0){
            spots.add(new Spot());
            n--;
        }
    }

    public int findAvailableSpots(Vehicle vehicle){
        int size = vehicle.getSize();
        for(int left = 0;left<spots.size();left++){
            if(spots.get(left).isAvailable()){
                for(int right = left;right<spots.size();right++){
                    if(spots.get(right).isAvailable()) {
                        if (right - left + 1 >= size) {
                            return left;
                        } else {
                            continue;
                        }
                    }else{
                       break;
                    }
                }
            }

        }
        return -1;
    }
}
