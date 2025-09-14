package Structural.Decorator.decorators;

import Structural.Decorator.BasePizza;
import Structural.Decorator.BasePizzaDecorator;
import Structural.Decorator.component;

public class addCheese extends BaseDecorator {

    public addCheese(component component) {
        super(component);
    }

    @Override
    public int cost() {
        return component.cost() + 50;
    }
}
