package DesignPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.sellPizza("pepper");
    }
}
