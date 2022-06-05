package lesson2;

public class Calculator {
    public static void main(String[] args) {
        int sum = countSum(9, 12);
        int minus = countMinus(12, 8);
        int multiply = countMultiply(5, 9);
        int division = countDivision(12, 6);
        System.out.println("Сумма " + sum + "\nВычитание " + minus + "\nУмножение " + multiply + "\nДеление " + division);

    }

    public static int countSum(int a, int b) {
        return a + b;
    }

    public static int countMinus(int a, int b) {
        return a - b;
    }

    public static int countMultiply(int a, int b) {
        return a * b;
    }

    public static int countDivision(int a, int b) {
        return a / b;
    }


}
