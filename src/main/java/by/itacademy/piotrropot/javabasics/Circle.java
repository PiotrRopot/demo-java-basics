package by.itacademy.piotrropot.javabasics;

public class Circle {
    public static void main(String args[]) {
        int r = 3;
        double area = Math.PI * (r * r);
        int result = (int) Math.ceil(area);
        System.out.println("Площадь круга равна: " + result);
    }
}
