package DesignPattern.FactoryMethod;

public abstract class PizzaStore {
    Pizza pizza;

    public void sellPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

    public abstract Pizza createPizza(String type);
}
