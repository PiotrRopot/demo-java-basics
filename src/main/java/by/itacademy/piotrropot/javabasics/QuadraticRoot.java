package by.itacademy.piotrropot.javabasics;

import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();
        double d = b * b - (4 * a * c);

        if (d < 0) {
            System.out.println("Нет корней");
        } else if (d == 0) {
            System.out.println(-b / (a * a));
        } else
            System.out.println((-b + Math.sqrt(d)) / (a * a) + " и " + ((-b - Math.sqrt(d)) / (a * a)));
    }
}
