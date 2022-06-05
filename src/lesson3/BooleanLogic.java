package lesson3;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;        //или
        boolean d = a & b;        //и
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a | (или) b = " + c);
        System.out.println("a &(и) b = " + d);
        System.out.println("a ^ b = " + e);
        System.out.println("(a!(не равно) & b) | (a & !b) = " + f);
        System.out.println("!a = " + g);
    }
}
