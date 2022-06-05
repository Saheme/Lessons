package lesson3;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String i = scan.nextLine();
        int number = Integer.parseInt(i);
        if (number % 2 != 0) {
            System.out.println("это нечетное число = " + number);
        } else {
            System.out.println("Это четное число ");
        }

    }
}
