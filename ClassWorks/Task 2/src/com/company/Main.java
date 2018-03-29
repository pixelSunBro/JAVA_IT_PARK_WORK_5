package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 2, 2};
        for (int i = 0; i < a.length; i++) {

                a[2] = a[i] - 1;

            System.out.print(a[i] + " ");
        }

        System.out.println(Arrays.toString(a));
        System.out.println();

        int b[] = {2, 2, 1, 6, 5};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
    }
}

