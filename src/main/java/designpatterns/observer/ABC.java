package designpatterns.observer;

public class ABC extends TempObserver {
    @Override
    void update() {
        System.out.print("ABC notified");
    }


}
