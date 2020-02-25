package designpatterns.decorator;

public class PepperTopping extends PizzaDecorator {
    PepperTopping(Pizza pizza) {
        super(pizza);
    }

    int getCost() {
        return pizza.getCost() + 2;
    }

    public String getDescription() {
        return pizza.getDescription() + ", pepper";
    }
}
