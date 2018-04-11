package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        RationalNumber rationalNumber = new RationalNumber(random.nextInt(100), random.nextInt(100));
        System.out.println(rationalNumber.toDouble());
        rationalNumber.show();
        System.out.println("Введите чеслитель: ");
        int numerator = scanner.nextInt();
        System.out.println("Введите знаменатель: ");
        int denominator = scanner.nextInt();
        System.out.println(rationalNumber.nod(numerator, denominator));
        rationalNumber.optimize();
        System.out.println();
    }
}
