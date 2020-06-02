package ParkingLot;

import ParkingLot.Exception.SpotUnavailableException;

public class Spot {
    private boolean available;

    public Spot(){
        this.available = true;
    }

    public void takeSpot(){
        if(available==false){
            throw new SpotUnavailableException();
        }

        this.available = true;
    }

    public void freeSpot(){
        this.available = true;
    }

    public boolean isAvailable(){
        return available;
    }


}
