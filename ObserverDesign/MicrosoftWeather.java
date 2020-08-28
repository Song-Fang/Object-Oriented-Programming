package DesignPattern.ObserverDesign;

public class MicrosoftWeather extends Observer{
    @Override
    public void display() {
        System.out.println("Hello, This is Microsoft Weather Hub!");
        System.out.println("Temperature:"+getTemperature());
        System.out.println("Humidity:"+getHumidity());
        System.out.println("Pressure:"+getPressure());
    }
}
