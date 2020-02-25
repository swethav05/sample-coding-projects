package designpatterns.decorator;

public class ThinCrustPizza extends Pizza {


    ThinCrustPizza(String description) {
        setDescription(description);
    }

    int getCost() {
        return 10;
    }
}
