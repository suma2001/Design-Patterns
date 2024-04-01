package DecoratorPattern.toppings;

import DecoratorPattern.base.BasePizza;

public class ExtraCheeseTopping  extends ToppingDecorator {

    BasePizza pizza;

    public ExtraCheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int cost() {
        return pizza.cost() + 5;
    }
}
