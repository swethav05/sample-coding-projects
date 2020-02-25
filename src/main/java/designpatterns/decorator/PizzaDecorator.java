package designpatterns.decorator;

public abstract class PizzaDecorator extends Pizza {
    Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
