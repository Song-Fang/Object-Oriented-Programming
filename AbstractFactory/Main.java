package DesignPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore(new PittFactory());
        ps.sellPizza("pepper");
    }
}
