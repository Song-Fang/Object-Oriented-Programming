package DesignPattern.ObserverDesign;

public class Main {
    public static void main(String[] args) {
        WeatherHub pittWeatherHub = new PittWeatherHub();
        Observer googleObserver = new GoogleWeather();
        pittWeatherHub.enrollClient(googleObserver);
        pittWeatherHub.updateWeather(12,15,17);
    }
}
