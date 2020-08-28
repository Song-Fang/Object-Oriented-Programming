package DesignPattern.DependencyInverse;

public class Student {
    public void take(Classes classes){
        System.out.println("I'm ready to take classes!");
        classes.showContent();
    }
}
