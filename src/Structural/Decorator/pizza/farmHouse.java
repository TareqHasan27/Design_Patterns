package Structural.Decorator.pizza;

import Structural.Decorator.BasePizza;
import Structural.Decorator.BasePizzaDecorator;
import Structural.Decorator.component;

public class farmHouse implements component {
    @Override
    public int cost() {
      return 150;
    }
}
