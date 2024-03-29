package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedTernary01 { public static void main(String[] args) {

        /*
                Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
                If a year is not divisible by 100 then it must be divisible by 4.
         */

    int year = 1800;

    // (Condition)         ?                  (Ternary 1)                   :                        (Ternary 2);
    String isLeap =  (year%100==0)        ? (  year%400==0 ? "Leap year" : "Not leap year")   : (  year%4==0 ?  "Leap year" : "Not leap year"  );
    System.out.println(isLeap);

    Scanner scan =new Scanner(System.in);
    int num=scan.nextInt();

    String number=(num%4==0) ? (num%5==0 ? "40 a bolunur " : "40 a bolunmez"):(num%3==0 ? "21 a bolunur " :"21 e bolunmez");
    System.out.println(number);
}

}
