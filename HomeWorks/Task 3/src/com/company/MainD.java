package com.company;

import java.util.Random;

public class MainD {
    public static void main(String[] args) {
        Random random = new Random();
        int M = 4;
        int N = 4;
        int matrix[][] = new int[M][N];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum = sum + matrix[i][matrix[i].length - 1 - i];
        }
        System.out.println(sum);
    }
}
