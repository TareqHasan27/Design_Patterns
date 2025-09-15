package Creational.AbstractFactory.FactoryProducer;

import Creational.AbstractFactory.CarFactory.CarType;
import Creational.AbstractFactory.CarFactory.Econmic;
import Creational.AbstractFactory.CarFactory.Luxury;

public class FactoryProducer {
    public CarType createCarType(String carType){
        if(carType.equals("Economic")){
            return new Econmic();
        }
        return new Luxury();
    }
}
