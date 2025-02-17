package StrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Having sports drive capability");
    }
}
