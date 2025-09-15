package Creational.AbstractFactory.CarFactory;

import Creational.AbstractFactory.Car.Car;
import Creational.AbstractFactory.Car.Corrolla;
import Creational.AbstractFactory.Car.Hyundai;

public class Econmic implements CarType {
    @Override
    public Car getCar(int price) {
        if(price >= 200000 && price < 1000000){
            return new Hyundai();
        }
        else if(price < 200000){
            return new Corrolla();
        }
        return null;
    }
}
