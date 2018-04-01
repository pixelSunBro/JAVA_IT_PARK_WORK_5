package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 4, 2, 5, 8};
        for (int i = 0; i <= a.length - 2; i++) {

                if (i >= 2)  {
                   a[i] = a[i + 1];
                }
                a[a.length - 1] = 0;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
        System.out.println();
        int b[] = {2, 2, 1, 6, 5};
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }

    }
}

