package Behavioral.StrategyPattern.Strategy;

public class SportsCarStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Car");
    }
}
