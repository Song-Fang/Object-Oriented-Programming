package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<Row> rows;
    private int level;

    public Level(int m,int n,int level){
        this.level = level;
        rows = new ArrayList<>();
        while(m>0) {
            rows.add(new Row(level,m,n));
            m--;
        }
    }

    public List<Spot> findAvailableSpots(Vehicle v){
        List<Spot> results = new ArrayList<>();
        for(Row row:rows){
            List<Spot> temp = row.findAvailableSpots(v);
            for(Spot spot:temp){
                results.add(spot);
            }
        }
        return results;
    }

    public int getAvailableCount(Vehicle v){
        int sum = 0;
        for(Row row:rows){
            sum += row.getAvailableCount(v);
        }
        return sum;
    }
}
