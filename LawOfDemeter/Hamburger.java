package DesignPattern.LawOfDemeter;

import com.sun.beans.finder.BeanInfoFinder;

public class Hamburger {
    private Beef beef;
    private Egg egg;
    private Lettuce lettuce;

    public Hamburger(Beef beef,Egg egg,Lettuce lettuce){
        this.beef = beef;
        this.egg = egg;
        this.lettuce = lettuce;
    }

    public void showHamburger(){
        System.out.println("This is a delicious hamburger!");
    }
}
