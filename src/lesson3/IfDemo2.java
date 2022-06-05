package lesson3;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        if (scan.hasNextInt()) {

            int a = scan.nextInt();
            compareMethod(a);
        } else {
            System.out.println("вы ввели что-то не то");
        }
    }

    private static void compareMethod(int a) {
        if (a > 0 && a < 10) {
            System.out.println("Число меньше 10");
        } else if (a > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
