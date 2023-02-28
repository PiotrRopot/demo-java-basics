package by.itacademy.piotrropot.javabasics;

import java.util.Scanner;

public class News {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество новостей: ");
        int news = scanner.nextInt();
        int pages = (int) Math.ceil(news / 10.0);
        System.out.println("Вам необходимо открыть " + pages + " страницы " + "что бы посмотреть " + news +  " новостей");
    }
}
