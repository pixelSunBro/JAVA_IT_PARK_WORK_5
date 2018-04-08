package com.company;

public class Transport {
    private String model;
    protected double mileage;//пробег
    protected double fuelConsumption;//потребление топлива
    protected double fuelAmount;//кол-во топлива
    protected double countFuelConsumption;//Кол-во потраченного топлива

    public Transport(String model, double fuelConsumption, double fuelAmount) {
        this.model = model;
        this.mileage = 0;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }

    public void go(double km) {
        this.mileage += km;
        this.countFuelConsumption = km * (fuelConsumption / 100);
        this.fuelAmount -= countFuelConsumption;
    }

    public void setMileageCountFuelConsumptionFuelAmount() {
        System.out.println("Мы проехали " + mileage + " км");
        System.out.println("Мы потратили " + countFuelConsumption + " л топлива");
        System.out.println("У нас осталось " + fuelAmount + " л топлива");
    }
}
