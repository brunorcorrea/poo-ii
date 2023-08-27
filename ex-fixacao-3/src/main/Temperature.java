package main;

public class Temperature {
    private Double temperatureInCelsius;

    public Double getTemperature() { //Fahrenheit
        return (temperatureInCelsius * 1.8) + 32;
    }

    public void setTemperature(Double temperature) { //Celsius
        this.temperatureInCelsius = temperature;
    }
}
