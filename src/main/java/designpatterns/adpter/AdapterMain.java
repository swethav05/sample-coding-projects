package designpatterns.adpter;

public class AdapterMain {
    public static void main(String args[]){
        Duck duck = new RedHeadDuck();
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        turkeyAdapter.quack();

    }
}
