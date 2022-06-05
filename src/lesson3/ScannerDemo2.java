package lesson3;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String s1 = scan.nextLine();  // nextLine - считывает любую строку
        String s2 = scan.nextLine();

        System.out.println(s1 + " " + " + " + s2);


    }
}
