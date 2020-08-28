package DesignPattern.DecorationMode;

public class Lemonade extends Decoration{
    public Lemonade(Drink drink){
        super(drink);
        setDescription("Lemonade");
        setPrice(3);
    }
}
