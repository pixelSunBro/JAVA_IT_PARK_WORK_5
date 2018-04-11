package com.company;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            System.err.println("Основание и высота треугольника должны быть больше нуля!");
        } else {
            this.base = base;
            this.height = height;
            System.out.println("Площадь треугольника равна: " + areaTriangle());
        }
    }

    private double areaTriangle() {
        double area = 0.5 * base * height;
        return area;
    }
}
