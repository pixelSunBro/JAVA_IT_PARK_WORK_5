package com.company;

import java.util.Scanner;

public class Main {

    public static int parse(char arr[]) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер масива: ");
        int arr[] = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (1 + i) + " число");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
