package main;

public class TemperatureMain {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setTemperature(10.0);
        System.out.println("Temperatura em Fahrenheit: " + temperature.getTemperature());
    }
}
