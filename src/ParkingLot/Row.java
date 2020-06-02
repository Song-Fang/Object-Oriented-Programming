package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Row {
    List<Spot> spots;
    int row;
    int level;

    public Row(int level,int n,int row){
        this.level = level;
        this.row = row;
        spots = new ArrayList<>();
        while(n>0){
            spots.add(new Spot(level,row,n));
            n--;
        }
    }
    public Spot getSpot(int col){
        for(int i =0;i<spots.size();i++){
            if(col == i) return spots.get(i);
        }
        throw new IllegalArgumentException();
    }

    public List<Spot> findAvailableSpots(Vehicle vehicle){
        List<Spot> result = new ArrayList<>();
        int size = vehicle.getSize();
        for(int left = 0;left<spots.size();left++){
            if(spots.get(left).isAvailable()){
                for(int right = left;right<spots.size();right++){
                    if(spots.get(right).isAvailable()) {
                        if (right - left + 1 >= size) {
                            result.add(getSpot(left));
                        } else {
                            continue;
                        }
                    }else{
                       break;
                    }
                }
            }

        }
        return result;
    }

    public int getAvailableCount(Vehicle v){
        return findAvailableSpots(v).size();
    }
}
