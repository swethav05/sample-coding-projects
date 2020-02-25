package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends TemperaturePublisher {
    List<TempObserver> observers = new ArrayList();
    int temperature;
    int speed;

    void setTemperature(int temp) {
        this.temperature = temp;
        notifyObservers();
    }

    void setSpeed(int speed) {
        this.speed = speed;
        notifyObservers();
    }

    @Override
    void register(TempObserver tempObserver) {
        observers.add(tempObserver);
    }

    @Override
    void remove(TempObserver tempObserver) {
        observers.remove(temperature);
    }

    @Override
    void notifyObservers() {
        for (TempObserver tempObserver : observers) {
            tempObserver.update();
        }
    }
}
