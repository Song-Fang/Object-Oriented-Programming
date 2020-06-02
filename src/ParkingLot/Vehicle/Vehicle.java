package ParkingLot.Vehicle;

public class Vehicle {
    private int size;

    public Vehicle(int size){
        if(size<=0){
            throw new IllegalArgumentException();
        }
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
