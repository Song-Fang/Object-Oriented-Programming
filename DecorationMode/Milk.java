package DesignPattern.DecorationMode;

public class Milk extends Decoration{
    public Milk(Drink drink){
        super(drink);
        setDescription("milk");
        setPrice(3);
    }
}
