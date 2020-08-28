package DesignPattern.ObserverDesign;

public interface WeatherHub {
    public void enrollClient(Observer observer);
    public void removeClient(Observer observer);
    public void updateWeather(int temperature, int humidity,int pressure);
}
