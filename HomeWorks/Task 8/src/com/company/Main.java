package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Узнать площадь круга: ");
            System.out.println("2. Узнать площадь квадрата: ");
            System.out.println("3. Узнать площадь прямоугольника: ");
            System.out.println("4. Узнать площадь овала: ");
            System.out.println("5. Узнать площадь треугольника: ");
            System.out.println();

            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите радус круга: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println();
                    break;
                }

                case 2: {
                    System.out.println("Ведите длинну сторон: ");
                    double firstSide = scanner.nextDouble();
                    double secondSide = scanner.nextDouble();
                    Square square = new Square(firstSide, secondSide);
                    System.out.println();
                    break;
                }

                case 3: {
                    System.out.println("Ведите длины сторон: ");
                    double firstSide = scanner.nextDouble();
                    double secondSide = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(firstSide, secondSide);
                    System.out.println();
                    break;
                }

                case 4: {
                    System.out.println("Ведите длинны большой и малой полуосей: ");
                    double semimajorAxis = scanner.nextDouble();
                    double minorAxis = scanner.nextDouble();
                    Ellipse ellipse = new Ellipse(semimajorAxis, minorAxis);
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("Ведите основание и высоту треугольника: ");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.println();
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
