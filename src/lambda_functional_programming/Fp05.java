package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp05 {
    public static void main(String[] args) {
        System.out.println(getSumFromSevenToHundred());
        System.out.println();
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(findMultiplication());
        System.out.println();
        System.out.println(factorial(4));
        System.out.println();



    }


    //create a method to find the sum of integers from 7 to 100
    //create a method to find the sum of integers from 7 to 100
    public static int getSumFromSevenToHundred() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);
        /*this intStream does the same actions for loop does in structured programmin.
         * the last number is exclusive*/
    }

    public static int getSumFromSevenToHundred02() {
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);

    }

    //create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int findMultiplication() {
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }
    //create a method to calculate the factorial of a given number
    //5 factorial ?1.2.3.4.5=5!
    public static Object factorial(int x) {
       return  x>0 ?  IntStream.rangeClosed(1,x).reduce(1, Math::multiplyExact):"Do not use negative numbers ";
    }

}



