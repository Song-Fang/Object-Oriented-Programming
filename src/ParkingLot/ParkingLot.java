package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {
    private List<Level> levels;
    private static ParkingLot instance;
    private float hourlyRate;

    private ParkingLot(int level,int row,int col){
        levels = new ArrayList<Level>();
        while(level>0){
            levels.add(new Level(level,row,col));
        }
        level--;
    }

    public void setHourlyRate(float rate){
        this.hourlyRate = rate;
    }

    public float getHourlyRate(){
        return hourlyRate;
    }

    public ParkingLot getInstance(int level,int row,int col){
        if(instance==null){
            instance = new ParkingLot(level,row,col);
        }

        return instance;

    }

    public Ticket parkingCar(Vehicle v){
        List<Spot> spots = new ArrayList<Spot>();
        for(Level level:levels){
            spots = level.findAvailableSpots(v);
            if(spots.size()!=0){
                break;
            }
        }

        if(spots.size()==0){
            return null;
        }

        Spot spot = spots.get(0);
        spot.takeSpot();
        return new Ticket(new Date().getTime(),v,spot);
    }

    public float checkOut(Ticket t){
        float totalExpense = (new Date().getTime()-t.getStartTime())/3600/1000*hourlyRate;
        Spot spot = t.getSpot();
        spot.freeSpot();
        return totalExpense;
    }




}
