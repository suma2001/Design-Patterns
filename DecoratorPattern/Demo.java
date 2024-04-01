package DecoratorPattern;

import DecoratorPattern.base.BasePizza;
import DecoratorPattern.base.Marghareta;
import DecoratorPattern.base.VegDelight;
import DecoratorPattern.toppings.ExtraCheeseTopping;
import DecoratorPattern.toppings.MushroomTopping;

public class Demo {

    public static void main(String[] args) {
        BasePizza pizza = new MushroomTopping(new VegDelight());
        System.out.println("Veg Delight Pizza with Mushroom Topping : " + pizza.cost());

        BasePizza pizza2 = new ExtraCheeseTopping(new MushroomTopping(new Marghareta()));
        System.out.println("Marghareta Pizza with Mushroom Topping and Extra Cheese : " + pizza2.cost());

    }
    
}
