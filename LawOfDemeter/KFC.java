package DesignPattern.LawOfDemeter;

public class KFC {

    public Hamburger sell(){
        Hamburger hamburger = new Hamburger(new Beef(),new Egg(),new Lettuce());
        return hamburger;
    }
}
