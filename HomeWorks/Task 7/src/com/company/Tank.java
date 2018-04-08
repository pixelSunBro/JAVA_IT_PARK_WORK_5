package com.company;

public class Tank extends Transport {
    private double ruggedTerrainFuelConsumption;
    private double hingedTankLeft;
    private double hingedTankRight;


    public Tank(String model, double fuelConsumption, double fuelAmount, double hingedTankLeft, double hingedTankRight) {
        super(model, fuelConsumption, fuelAmount);
        this.ruggedTerrainFuelConsumption = fuelConsumption; // 100 * 75;//Потребеление топлива на пересеченной местности повышается примерно на 15%
        this.hingedTankLeft = hingedTankLeft;
        this.hingedTankRight = hingedTankRight;
    }

    @Override
    public void go(double km) {
        super.mileage += km;
        super.countFuelConsumption = km * (ruggedTerrainFuelConsumption / 100);
        if (countFuelConsumption == 450) {
            super.fuelAmount += hingedTankLeft + hingedTankRight - countFuelConsumption ;
        }else {
            super.fuelAmount -= countFuelConsumption;
        }

    }
}
