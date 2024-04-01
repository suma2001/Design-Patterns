package DecoratorPattern.toppings;

import DecoratorPattern.base.BasePizza;

public class MushroomTopping extends ToppingDecorator {
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int cost() {
        return pizza.cost() + 15;
    }
    
}
