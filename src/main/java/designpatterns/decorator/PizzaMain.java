package designpatterns.decorator;

public class PizzaMain {

    public static void main(String args[]) {
        Pizza pizza = new ThinCrustPizza("its a thin crust");

        pizza = new CheeseTopping(pizza);
        pizza = new PepperTopping(pizza);

        System.out.print(pizza.getDescription() + ":" + pizza.getCost());
    }
}
