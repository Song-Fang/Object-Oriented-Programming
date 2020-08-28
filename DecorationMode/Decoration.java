package DesignPattern.DecorationMode;

public class Decoration extends Drink{
    Drink drink;

    public Decoration(Drink drink){
        this.drink = drink;
    }

    @Override
    public int cost() {
        return getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+":"+getPrice()+"-----"+drink.getDescription()+":"+drink.getPrice();
    }
}
