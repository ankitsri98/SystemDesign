package DecoratorPattern.BaseComponent;

/*
This is a base component that is BasePizza in this example ( it can also be base car model )

There are multiple types of pizza which are basePizza but only cost is different

We have used abstract and not interface because
1. We don't have constructor control for initialization
Example:-
public abstract class ToppingDecorator extends BasePizza {
    public ToppingDecorator(BasePizza pizza) {
        // Validation
        validatePizza(pizza);

        // State initialization
        this.basePizza = pizza;
        initializeTopping();
    }

    private void validatePizza(BasePizza pizza) {
        if (pizza == null) {
            throw new IllegalArgumentException("Pizza cannot be null");
        }
        if (pizza.ingredients.size() >= 7) {
            throw new IllegalStateException("Cannot add more than 7 toppings");
        }
    }
}
2. State Management that is has-a relationship
Example :-
public abstract class BasePizza {
    protected int basePrice;            // Price state
    protected String description;       // Description state
    protected List<String> ingredients; // Ingredients state
}

public abstract class ToppingDecorator extends BasePizza {
    protected final BasePizza basePizza;    // Wrapped component state
    protected int toppingPrice;             // Topping specific price
    protected String toppingDescription;     // Topping description
}
 */
public abstract class BasePizza {
    public abstract int cost();
}