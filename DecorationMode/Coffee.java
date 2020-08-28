package DesignPattern.DecorationMode;

public class Coffee extends Drink{
    @Override
    public int cost() {
        return getPrice();
    }
}
