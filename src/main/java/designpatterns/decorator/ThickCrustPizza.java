package designpatterns.decorator;

public class ThickCrustPizza extends Pizza{


    ThickCrustPizza(String description) {
        setDescription(description);
    }

    public int getCost() {
        return 15;
    }
}
