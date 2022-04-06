package day12constructorsmethodoverloadingvariabletypes;

public class MyPractice02 {
    public static void main(String[] args) {

        System.out.println(add(3, 5));
        System.out.println(add(4, 7));
        System.out.println(add(3, 5, 7));
        System.out.println(add(4, 5, 6, 7));
        System.out.println(add(5.4, 3.3));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
