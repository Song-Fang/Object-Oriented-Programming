package DesignPattern.DecorationMode;

public class Main {
    public static void main(String[] args) {
        Drink drink = new BlackCoffee();
        System.out.println(drink.cost());

        drink = new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());

        drink = new Lemonade(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDescription());
    }
}
