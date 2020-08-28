package DesignPattern.LiscovSubstitution;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.useGun(new Rifle());
    }
}
