package DesignPattern.AbstractFactory;

public class PizzaStore {
    PizzaFactory pf;

    public PizzaStore(PizzaFactory pf){
        this.pf = pf;
    }

    public void sellPizza(String type){
        Pizza pizza = pf.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }
}
