package DecoratorPattern.Decorator;

import DecoratorPattern.BaseComponent.BasePizza;

/*

ToppingDecorator extends BasePizza because we put toppings on pizza only and create a new pizza

The Resultant = Pizza + Topping is also a pizza that's why we has-a dependency as BasePizza


Base Decorator
 */
public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza basePizza;
}
