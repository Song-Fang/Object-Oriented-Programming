package DesignPattern.AbstractFactory;

public class NewYorkFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("This is NewYork City!");

        if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(type);
        }else if(type.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName(type);
        }
        return pizza;
    }
}
