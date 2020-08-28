package DesignPattern.LawOfDemeter;

public class Song {
    public void eat(){
        new KFC().sell().showHamburger();
        System.out.println("I am good");
    }
}
