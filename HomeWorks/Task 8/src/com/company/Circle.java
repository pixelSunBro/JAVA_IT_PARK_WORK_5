package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.err.println("Радиус должен быть больше нуля!");
        } else {
            this.radius = radius;
            System.out.println("Площадь круга равна: " + areaCircle());
        }
    }

    private  double areaCircle() {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
