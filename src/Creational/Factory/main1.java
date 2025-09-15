import Creational.Factory.shapeFactory.factoryShape;


void main() {
    factoryShape factoryShape = new factoryShape();
    factoryShape.getShape("Circle").draw();
    factoryShape.getShape("Rectangle").draw();
    factoryShape.getShape("Triangle").draw();
}