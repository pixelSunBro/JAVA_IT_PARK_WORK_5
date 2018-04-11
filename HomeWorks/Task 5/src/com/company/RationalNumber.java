package com.company;

public class RationalNumber {
    private int x;
    private int y;

    public RationalNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double toDouble() {
        return (double) x / y;
    }

    void show() {
        System.out.println(x + y);
    }

    int nod(int a, int b) {
        a = x;
        b = y;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = y % a;
            }
        }
        return a + b;
    }

    void optimize() {
        System.out.println(x + "/" + y + " = " + x / nod(x, y) + "/" + y / nod(x, y) + " = " + toDouble());
    }
}
