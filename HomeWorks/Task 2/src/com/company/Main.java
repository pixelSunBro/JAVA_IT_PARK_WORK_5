package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("MENU");
            System.out.println("1. Указать диапозон и вывести на экран его четные числа");
            System.out.println("2. Получить сумму веденных чисел");
            System.out.println("3. Получить разность веденных чисел");
            System.out.println("4. Получить произведение веденных чисел");
            System.out.println("5. Получить частное веденных чисел");

            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Ведите первое число диапозона: ");
                    int firstNum = scanner.nextInt();
                    System.out.println("Введите последние число диапозона: ");
                    int lastNum = scanner.nextInt();
                    for (int i = firstNum; i <= lastNum; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");
                    break;
                }

                case 2: {
                    System.out.println("Ведите первое число: ");
                    int a = scanner.nextInt();
                    System.out.println("Ведите второе число: ");
                    int b = scanner.nextInt();
                    int sumNum = a + b;
                    System.out.println("Сумма чисел = " + sumNum);
                    break;
                }

                case 3: {
                    System.out.println("Ведите первое число: ");
                    int a = scanner.nextInt();
                    System.out.println("Ведите второе число: ");
                    int b = scanner.nextInt();
                    int sumNum = a - b;
                    System.out.println("Разность чисел = " + sumNum);
                    break;
                }

                case 4: {
                    System.out.println("Ведите первое число: ");
                    int a = scanner.nextInt();
                    System.out.println("Ведите второе число: ");
                    int b = scanner.nextInt();
                    int sumNum = a * b;
                    System.out.println("Произведение чисел = " + sumNum);
                    break;
                }

                case 5: {
                    System.out.println("Ведите первое число: ");
                    int a = scanner.nextInt();
                    System.out.println("Ведите второе число: ");
                    int b = scanner.nextInt();
                    int sumNum = a / b;
                    System.out.println("Частное чисел = " + sumNum);
                    break;
                }

                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
