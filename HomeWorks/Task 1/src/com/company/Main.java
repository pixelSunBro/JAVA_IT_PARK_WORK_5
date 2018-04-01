package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 255");
        int number = scanner.nextInt();
        int constNumber = 2;

        int aNumber = number / constNumber ;
        int bNumber = aNumber / constNumber;
        int cNumber = bNumber / constNumber;
        int dNumber = cNumber / constNumber;
        int eNumber = dNumber / constNumber;
        int fNumber = eNumber / constNumber;
        int gNumber = fNumber / constNumber;

        System.out.print(gNumber % constNumber);
        System.out.print(fNumber % constNumber);
        System.out.print(eNumber % constNumber);
        System.out.print(dNumber % constNumber);
        System.out.print(cNumber % constNumber);
        System.out.print(bNumber % constNumber);
        System.out.print(aNumber % constNumber);
        System.out.print(number % constNumber);
    }
}
