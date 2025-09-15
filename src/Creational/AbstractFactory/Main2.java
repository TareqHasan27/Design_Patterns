import Creational.AbstractFactory.Car.Car;
import Creational.AbstractFactory.CarFactory.CarType;
import Creational.AbstractFactory.FactoryProducer.FactoryProducer;

void main() {
    FactoryProducer factory = new FactoryProducer();
    CarType CarType = factory.createCarType("Economic");
    Car car =  CarType.getCar(200000);
    System.out.println(car.getSpeed());
}
