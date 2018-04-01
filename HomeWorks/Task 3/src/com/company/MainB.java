package com.company;

import java.util.Scanner;


public class MainB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("M: ");
        int M = scanner.nextInt();
        System.out.println("N: ");
        int N = scanner.nextInt();
        int sum = 1;
        int matrix[][] = new int[M][N];
        for (int i = 0; i < matrix.length; i++) {
            if (i != 0 && i % 2 != 0) {
                for (int j = N - 1; j >= 0; j--) {
                    matrix[i][j] = sum;
                    sum++;
                }
            } else {

                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sum;
                    sum++;
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}