package DesignPattern.OpenAndClose;

public class Main {
    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.show(new PiChart());
    }
}
