package DecoratorPattern.Decorator;

import DecoratorPattern.BaseComponent.BasePizza;

// Concrete Decorators
public class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
