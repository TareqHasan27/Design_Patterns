package Structural.Decorator.decorators;

import Structural.Decorator.BasePizza;
import Structural.Decorator.BasePizzaDecorator;
import Structural.Decorator.component;

public class addMushroom extends BaseDecorator{

    public addMushroom(component component) {
        super(component);
    }

    @Override
    public int  cost() {
        return this.component.cost() + 30;
    }
}
