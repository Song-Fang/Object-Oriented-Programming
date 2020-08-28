package DesignPattern.WeatherPrediction;

public class Main {
    public static void main(String[] args) {
        WeatherDashBoard weatherDashBoard = new WeatherDashBoard();
        WeatherData weatherData = new WeatherData(weatherDashBoard);
        weatherData.updateWeather(11,3,15);

    }
}
