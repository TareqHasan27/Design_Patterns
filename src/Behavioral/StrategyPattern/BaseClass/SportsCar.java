package Behavioral.StrategyPattern.BaseClass;

import Behavioral.StrategyPattern.Strategy.SportsCarStrategy;

public class SportsCar extends Vehicle{
    public SportsCar() {
        super(new SportsCarStrategy());
    }
}
