package com.company;

import java.util.Random;

public class MainC {

    public static void main(String[] args) {
        Random random = new Random();
        int M = random.nextInt(100);
        int N = random.nextInt(100);
        int matrix[][] = new int[M][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            System.out.println("Минимальное число " + (i + 1) + " строки: " + min);
        }
    }
}


