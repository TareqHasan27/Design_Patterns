package Behavioral.StrategyPattern.BaseClass;

import Behavioral.StrategyPattern.Strategy.NormalCarStrategy;

public class NormalCar extends Vehicle
{
    public NormalCar()
    {
        super(new NormalCarStrategy());
    }
}
