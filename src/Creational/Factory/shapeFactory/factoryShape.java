package Creational.Factory.shapeFactory;

import Creational.Factory.shape.Circle;
import Creational.Factory.shape.Rectangle;
import Creational.Factory.shape.Triangle;
import Creational.Factory.shape.shape;

public class factoryShape {

    public shape getShape(String input)
    {
        return switch (input) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Triangle" -> new Triangle();
            default -> null;
        };
    }
}
