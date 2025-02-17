package DecoratorPattern.Decorator;


import DecoratorPattern.BaseComponent.BasePizza;

public class Mushroom extends ToppingDecorator {
    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
