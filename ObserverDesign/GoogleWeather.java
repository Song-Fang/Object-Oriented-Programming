package DesignPattern.ObserverDesign;

public class GoogleWeather extends Observer{

    @Override
    public void display() {
        System.out.println("Hello, This is Google Weather Hub!");
        System.out.println("Temperature:"+getTemperature());
        System.out.println("Humidity:"+getHumidity());
        System.out.println("Pressure:"+getPressure());
    }
}
