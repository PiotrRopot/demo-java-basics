package by.itacademy.piotrropot.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Введите математическое действие: ");
        String symbol = scanner.next();
        scanner.close();
        if (symbol.equals("+")) {
            System.out.print("ИТОГ: ");
            System.out.println(numberOne + numberTwo);
        }
        if (symbol.equals("-")) {
            System.out.print("ИТОГ: ");
            System.out.println(numberOne - numberTwo);
        }
        if (symbol.equals("*")) {
            System.out.print("ИТОГ: ");
            System.out.println(numberOne * numberTwo);
        }
        if (symbol.equals("/")) {
            System.out.print("ИТОГ: ");
            System.out.println(numberOne / numberTwo);
        }
    }
}
