package DesignPattern.WeatherPrediction;

public class WeatherDashBoard {
    private int temperature;
    private int humidity;
    private int pressure;

    public void update(int temperature,int humidity,int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("The weather is "+temperature+"---"+humidity+"---"+pressure);
    }


}
