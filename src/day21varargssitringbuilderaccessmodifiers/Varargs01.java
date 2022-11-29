package day21varargssitringbuilderaccessmodifiers;

public class Varargs01 {
    public static void main(String[] args) {

        add();// 0

        add(5);// 5
        add(5, 10);//15

        add(5, 10, 15);//30
        add(6,3,2,6,88,11);
        add(6,3);

    }

    //Note 1: You cannot use any other parameters after varargs
    //Note 2: You can use any other parameters except varargs before varargs
    //Note 3: Varargs must be last parameter everytime
    //Note 4: You can use just a single varargs in a method parenthesis

    public static void add(int... a) {

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }

        System.out.println(sum);
    }
    /*Varargs is a short name for variable arguments.*/

    /*Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
    Variable Arguments in Java simplifies the creation of
     methods that need to take a variable number of arguments.*/

    //Let’s suppose you are creating a Java method. However,
    // you are not sure how many arguments your method is going to accept.
    // To address this problem, Java 1.5 introduced varargs.
}
