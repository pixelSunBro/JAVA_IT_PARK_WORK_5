package com.company;

public class Ellipse {
    private double semimajorAxis;
    private double minorAxis;

    public Ellipse(double semimajorAxis, double minorAxis) {
        if (semimajorAxis <= 0 || minorAxis <= 0) {
            System.err.println("Обе оси должны быть больше нуля!");
        } else {
            this.semimajorAxis = semimajorAxis;
            this.minorAxis = minorAxis;
            System.out.println("Площадь овала равна: " + areaEllipse());
        }
    }

    private double areaEllipse() {
        double area = Math.PI * semimajorAxis * minorAxis;
        return area;
    }
}
