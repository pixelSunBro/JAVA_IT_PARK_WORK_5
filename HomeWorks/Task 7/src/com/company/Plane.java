package com.company;

public class Plane extends Transport {
    private double fuelAmountFirstTank, fuelAmountSecondTank;
    private double speed;
    private double mileage;
    private double countFuelConsumption;

    public Plane(String model, double fuelConsumption, double fuelAmount, double fuelAmountFirstTank, double fuelAmountSecondTank) {
        super(model, fuelConsumption, fuelAmount);
        this.fuelAmountFirstTank = fuelAmountFirstTank;
        this.fuelAmountSecondTank = fuelAmountSecondTank;
        this.speed = 1900;
        this.mileage = 0;
    }

    @Override
    public void go(double km) {
        this.mileage += km;
        this.countFuelConsumption = km / speed * fuelConsumption;
        this.fuelAmount -= countFuelConsumption;
        this.fuelAmountFirstTank -= countFuelConsumption / 2;
        this.fuelAmountSecondTank = fuelAmountFirstTank;
    }

    public void setMileageCountFuelConsumptionFuelAmount() {
        System.out.println("Мы пролетели " + mileage + " км");
        System.out.println("Мы потратили " + countFuelConsumption + " л топлива");
        System.out.println("Всего тоаплива у нас осталось " + fuelAmount + " л");
        System.out.println("В первом баке осталось " + fuelAmountFirstTank + " л топлива, во втором " + fuelAmountSecondTank);
    }
}
