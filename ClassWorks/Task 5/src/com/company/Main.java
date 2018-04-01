package com.company;

public class Main {

    public static int numbers(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(numbers(124));
    }
}
