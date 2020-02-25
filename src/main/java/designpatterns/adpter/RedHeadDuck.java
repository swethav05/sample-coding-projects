package designpatterns.adpter;

public class RedHeadDuck implements Duck{
    @Override
    public void quack() {
        System.out.print("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.print("fly fly");
    }
}
