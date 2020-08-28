package DesignPattern.InterfaceSegregation;

public class ToyGun implements SportsGun{
    @Override
    public void assembly() {
        System.out.println("I am going to assembly the guns!");
    }
}
