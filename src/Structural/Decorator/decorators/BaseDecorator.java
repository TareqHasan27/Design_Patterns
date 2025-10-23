package Structural.Decorator.decorators;

import Structural.Decorator.component;

public class BaseDecorator implements component {
    component component;
    public BaseDecorator(component component) {
        this.component = component;
    }
    @Override
    public int cost() {
        return component.cost();
    }
}
