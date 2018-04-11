package com.company;

public class Square {
    private double firstSide;
    private double secondSide;

    public Square(double firstSide, double secondSide) {
        if (firstSide <= 0 || secondSide <=0) {
            System.err.println("Обе стороны должны быть больше нуля!");
        } else {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            System.out.println("Площадь квадрата равна: " + areaSquare());
        }
    }

    private double areaSquare() {
        double area = firstSide * secondSide;
        return area;
    }
}
