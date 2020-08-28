package DesignPattern.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class PittWeatherHub implements WeatherHub{
    private int temperature;
    private int humidity;
    private int pressure;
    private List<Observer> observerList;

    public PittWeatherHub(){
        observerList = new ArrayList<>();
    }

    @Override
    public void enrollClient(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeClient(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void updateWeather(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    private void notifyObserver(){
        for(Observer observer:observerList){
            observer.updateWeather(temperature,humidity,pressure);
        }
    }
}
