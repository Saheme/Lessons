package lesson3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Введите целое число : ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {    // hasNextInt - метод проверяет введено ли целое число
            int i = scan.nextInt();  // nextInt - сканер считывает целое число
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целое число ");
        }

    }
}


