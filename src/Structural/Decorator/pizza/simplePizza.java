package Structural.Decorator.pizza;

import Structural.Decorator.BasePizza;
import Structural.Decorator.component;

public class simplePizza implements component {
    @Override
    public int cost() {
        return 120;
    }
}
