package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("MENU");
            System.out.println("1. Указать диапазон и вывести на экран его четные числа");
            System.out.println("2. Указать диапазон и узнать сумму его чисел");

            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Ведите первое число диапазон: ");
                    int firstNum = scanner.nextInt();
                    System.out.println("Введите последние число диапазон: ");
                    int lastNum = scanner.nextInt();
                    int sumNum = firstNum + lastNum;
                    for (int i = firstNum; i <= lastNum; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");
                    System.out.println("1. Показать сумму введенных чисел: ");
                    System.out.println("2. Начать заново");
                    int command2 = scanner.nextInt();
                    switch (command2) {
                        case 1: {
                            System.out.println("Сумма введеных чисел равна: " + sumNum);
                            break;
                        }

                        case 2:
                            continue;
                    }
                    break;
                }

                case 2: {
                    System.out.println("Ведите первое число диапазон: ");
                    int firstNum = scanner.nextInt();
                    System.out.println("Введите последние число диапазон: ");
                    int lastNum = scanner.nextInt();

                    long b = 0;
                    for (int i = firstNum; i <= lastNum; i++) {
                        b = b + i;
                        if (i == lastNum) {
                            System.out.println(b);
                        }
                    }
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
