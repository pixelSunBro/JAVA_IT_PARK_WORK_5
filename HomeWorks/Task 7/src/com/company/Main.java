package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Volkswagen", 7.0, 55.0);
        car.go(15);
        car.setMileageCountFuelConsumptionFuelAmount();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 3.92, 17);
        motorcycle.go(15);
        motorcycle.setMileageCountFuelConsumptionFuelAmount();
        System.out.println();

        Plane plane = new Plane("Су-34", 4000, 11500, 5750, 5750);//fuelConsumption литров/час
        plane.go(5462.5);
        plane.setMileageCountFuelConsumptionFuelAmount();
        System.out.println();

        Tank tank = new Tank("T-90", 300, 450, 50, 50);
        tank.go(100);
        tank.setMileageCountFuelConsumptionFuelAmount();
        System.out.println();
    }
}
