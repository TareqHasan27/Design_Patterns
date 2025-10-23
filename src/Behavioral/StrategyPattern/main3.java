import Behavioral.StrategyPattern.BaseClass.SportsCar;
import Behavioral.StrategyPattern.BaseClass.Vehicle;
import Behavioral.StrategyPattern.Strategy.NormalCarStrategy;
import Behavioral.StrategyPattern.Strategy.SportsCarStrategy;

static void main() {
    Vehicle vehicle = new Vehicle(new SportsCarStrategy());
    vehicle.drive();
    Vehicle vehicle1 = new Vehicle(new NormalCarStrategy());
    vehicle1.drive();
}
