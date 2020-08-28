package DesignPattern.LiscovSubstitution;

public class Soldier {
    public void useGun(WeaponGun weaponGun){
        System.out.println("Start to shoot!");
        weaponGun.shoot();
    }
}
