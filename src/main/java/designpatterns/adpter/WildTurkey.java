package designpatterns.adpter;

public class WildTurkey implements Turkey{
    public void gobble(){
        System.out.print("Gobble Gobble");
    }

    public void fly(){
        System.out.print("turkey flying");
    }
}
