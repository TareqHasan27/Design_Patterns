package Creational.AbstractFactory.CarFactory;

import Creational.AbstractFactory.Car.Car;

public interface CarType {
    public Car getCar(int price);
}
