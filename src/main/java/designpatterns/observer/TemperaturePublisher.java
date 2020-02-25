package designpatterns.observer;

public abstract class TemperaturePublisher {
    abstract void register(TempObserver tempObserver);

    abstract void remove(TempObserver tempObserver);

    abstract void notifyObservers();
}
