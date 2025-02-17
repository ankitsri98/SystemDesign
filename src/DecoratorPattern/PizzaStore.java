package DecoratorPattern;

import DecoratorPattern.BaseComponent.BasePizza;
import DecoratorPattern.BaseComponent.Farmhouse;
import DecoratorPattern.BaseComponent.Margherita;
import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

public class PizzaStore {
    public static void main(String[] args) {
        // Basic pizzas
        BasePizza margherita = new Margherita();
        System.out.println("Plain Margherita Cost: " + margherita.cost());  // 100

        // Pizza with single topping
        BasePizza mushroomMargherita = new Mushroom(new Margherita());
        System.out.println("Mushroom Margherita Cost: " + mushroomMargherita.cost());  // 115

        // Pizza with multiple toppings
        BasePizza deluxeMargherita = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Deluxe Margherita Cost: " + deluxeMargherita.cost());  // 125

        // Different base pizza with toppings
        BasePizza specialFarmhouse = new ExtraCheese(new Mushroom(new Farmhouse()));
        System.out.println("Special Farmhouse Cost: " + specialFarmhouse.cost());  // 225
    }
}

