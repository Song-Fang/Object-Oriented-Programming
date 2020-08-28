package DesignPattern.ObserverDesign;

public abstract class Observer {
    private int temperature;
    private int humidity;
    private int pressure;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void updateWeather(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
public abstract void display();
}
