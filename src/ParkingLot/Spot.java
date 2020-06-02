package ParkingLot;

import ParkingLot.Exception.SpotUnavailableException;

public class Spot {
    private boolean available;
    private int level;
    private int row;
    private int column;

    public Spot(int level,int row,int column){
        this.level = level;
        this.row = row;
        this.column = column;
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
