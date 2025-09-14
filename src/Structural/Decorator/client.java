import Structural.Decorator.*;
import Structural.Decorator.decorators.addCheese;
import Structural.Decorator.decorators.addMushroom;
import Structural.Decorator.pizza.simplePizza;

void main() {
    component c = new addCheese(new addMushroom(new simplePizza()));
    System.out.println(c.cost());

}
