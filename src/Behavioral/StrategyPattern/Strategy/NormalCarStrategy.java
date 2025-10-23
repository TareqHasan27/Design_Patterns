package Behavioral.StrategyPattern.Strategy;

public class NormalCarStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Car");
    }
}
