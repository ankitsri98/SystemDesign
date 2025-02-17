package StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle  v1 = new SportsVehicle();
        v1.drive();

        Vehicle  v2 = new OffRoadVehicle();
        v2.drive();

        Vehicle  v3 = new GoodsVehicle();
        v3.drive();
    }
}