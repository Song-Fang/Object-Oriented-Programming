package DesignPattern.InterfaceSegregation;

public class Rifle extends WeaponGun{
    @Override
    public void shoot() {
        System.out.println("I'm shooting!");
    }

    @Override
    public void assembly() {
        System.out.println("I'm starting to assembly guns!");
    }
}
