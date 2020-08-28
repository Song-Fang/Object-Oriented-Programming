package DesignPattern.SimpleFactory;

public class EatPizza {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore(new SimplePizzaFactory());
        ps.orderPizza("Pepper");
    }
}
