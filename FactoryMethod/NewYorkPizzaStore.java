package DesignPattern.FactoryMethod;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("I am in NewYork Store to prepare Pizza for you!");
        System.out.println("Use NewYork City Style!");

        if(type.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("pepper");

        }else if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
