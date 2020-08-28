package DesignPattern.SimpleFactory;

public class SimplePizzaFactory {
    Pizza pizza;
    public Pizza createPizza(String type){
        if(type.equals("Pepper")){
            pizza = new PepperPizza();
        }else if(type.equals("Cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
