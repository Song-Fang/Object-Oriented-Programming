package DesignPattern.WeatherPrediction;

public class WeatherData {
    private int temperature;
    private int humidity;
    private int pressure;

    private WeatherDashBoard weatherDashBoard;


    public void setWeatherDashBoard(WeatherDashBoard weatherDashBoard) {
        this.weatherDashBoard = weatherDashBoard;
    }

    public WeatherData(WeatherDashBoard weatherDashBoard){
        this.weatherDashBoard = weatherDashBoard;
    }


    public void updateWeather(int temperature,int humidity,int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherDashBoard.update(temperature,humidity,pressure);
    }
}
