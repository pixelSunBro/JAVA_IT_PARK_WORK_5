package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("MENU");
            System.out.println("1. Указать диапазон и вывести на экран его четные числа");
            System.out.println("2. Получит сумму введенных чисел");
            System.out.println("3. Узнать сумму чисел введенного числа");

            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Ведите первое число диапазона: ");
                    int firstNum = scanner.nextInt();
                    System.out.println("Введите последние число диапазона: ");
                    int lastNum = scanner.nextInt();
                    for (int i = firstNum; i <= lastNum; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                }

                case 2: {
                    while (true) {
                        System.out.println("Укажите количество чисел которые вы введете: ");
                        int sumNum = scanner.nextInt();
                        int sum = 0;
                        for (int i = 0; i < sumNum; i++) {
                            System.out.println("Введите число № " + (i + 1) + ": ");
                            int number = scanner.nextInt();
                            sum += number;
                        }
                        System.out.println("Сумма введеных чисел равна: " + sum);
                        break;
                    }
                    break;
                }

                case 3: {
                    System.out.println("Ведите число: ");
                    int number = scanner.nextInt();
                    int sum = 0;
                    while (number > 0){
                        sum += number % 10;
                        number /= 10;
                    }
                    System.out.println(sum);
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
