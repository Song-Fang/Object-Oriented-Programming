package DesignPattern.LiscovSubstitution;

public class ToyGun extends Gun{
    @Override
    public void shoot() {
        System.out.println("This gun can't hurt other people!");
    }
}
