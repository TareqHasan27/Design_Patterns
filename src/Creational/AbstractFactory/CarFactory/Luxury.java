package Creational.AbstractFactory.CarFactory;

import Creational.AbstractFactory.Car.BMW;
import Creational.AbstractFactory.Car.Car;
import Creational.AbstractFactory.Car.Corrolla;
import Creational.AbstractFactory.Car.Mercedes;

public class Luxury implements CarType {

    @Override
    public Car getCar(int price) {
        if(price >= 10000000) {
            return new Mercedes();
        }else if(price < 10000000 && price >= 1000000){
            return new BMW();
        }
        return null;
    }
}
