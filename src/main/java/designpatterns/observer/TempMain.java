package designpatterns.observer;

public class TempMain {

    public static void main(String args[]) {

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.register(new ABC());
        weatherStation.register(new CNN());
        weatherStation.setSpeed(30);
        weatherStation.setTemperature(10);
    }
}
