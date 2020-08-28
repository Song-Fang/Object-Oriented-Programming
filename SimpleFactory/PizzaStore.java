package DesignPattern.SimpleFactory;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;
    Pizza pizza;

    public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String type){
        pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
