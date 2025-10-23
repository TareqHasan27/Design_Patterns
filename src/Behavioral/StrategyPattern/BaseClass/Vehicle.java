package Behavioral.StrategyPattern.BaseClass;

import Behavioral.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy drive;
    public Vehicle(DriveStrategy drive) {
        this.drive = drive;
    }
    public void drive() {
        drive.drive();
    }
}
