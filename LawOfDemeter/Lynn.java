package DesignPattern.LawOfDemeter;

public class Lynn {
    public void eat(){
        new KFC().sell().showHamburger();
        System.out.println("I am good");
    }
}
