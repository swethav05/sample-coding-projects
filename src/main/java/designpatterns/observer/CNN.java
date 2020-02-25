package designpatterns.observer;

public class CNN extends TempObserver {
    @Override
    void update() {
        System.out.print("CNN notified");
    }
}
