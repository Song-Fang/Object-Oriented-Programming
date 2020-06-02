package ParkingLot;

import ParkingLot.Spot;
import ParkingLot.Vehicle.Vehicle;

import java.util.Date;

public class Ticket {
    private Long startTime;
    private Vehicle v;
    private Spot spot;

    public  Ticket(Long startTime,Vehicle v,Spot spot){
        this.startTime = startTime;
        this.v = v;
        this.spot = spot;
    }

    public Vehicle getV(){
        return v;
    }

    public Spot getSpot(){
        return spot;
    }

    public Long getStartTime(){
        return startTime;
    }
}
