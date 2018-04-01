package com.company;

import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeArr = scanner.nextInt();
        int arr[] = new int[sizeArr];
        int totalArr[] = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Введите " + (i + 1) + " индекс массива");
            int index = scanner.nextInt();
            arr[i] = index;
            totalArr[i] = index;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    totalArr[j] = 0;
                    totalArr[i] = 0;
                }
            }
        }
        for (int i = 0; i <totalArr.length; i++) {
            System.out.print(totalArr[i] + " ");
        }
    }
}
