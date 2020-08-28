package DesignPattern.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        Soldior soldier = new Soldior();
        soldier.use(new Rifle());
        Civilian civilian = new Civilian();
        civilian.use(new ToyGun());
    }
}
