package by.itacademy.piotrropot.javabasics;

public class Random {
    public static void main(String[] args) {
        double a = Math.random() * 100;
        int result = (int) Math.ceil(a);
        System.out.println(result);
    }
}
