package day12constructorsmethodoverloadingvariabletypes;

public class MyPractice02 {
    public static void main(String[] args) {

        System.out.println(practice(5,8));

        System.out.println(practice(5,2,7));


        System.out.println(practice(5,8,5,9));
    }

    public static int practice(int a, int b){
        return a+b;
    }
    public static int practice(int a, int b, int c){
        return (a+b)-c;
    }

    public static int practice(int a, int b, int c, int d){
        return (a+b)-c+d;
}}
