package designpatterns.decorator;

public class CheeseTopping extends PizzaDecorator {

    CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    int getCost() {
        return pizza.getCost() + 1;
    }
}
