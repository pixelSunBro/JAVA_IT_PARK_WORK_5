package com.company;

import java.util.Scanner;

public class Main {
    public static int parse(char input[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите размер массива еще раз");//я не смог сделать общую перемнную
        int power = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i] * (Math.pow(10, power - 1));
            power--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер масива: ");
        int sizeArr = scanner.nextInt();
        char arr[] = new char[sizeArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (1 + i) + " число");
            arr[i] = (char) scanner.nextInt();
        }
        System.out.println(parse(arr));
    }
}
