package day27exception;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Write first number");
        int num1= scan.nextInt();

        System.out.println("Write Second number");
        int num2= scan.nextInt();

        System.out.println("Write Third number");
        int num3= scan.nextInt();

        if(num1<num2 & num1<num3){
            System.out.println(num1 + " is the smallest " +num2 + " and " + num3);
        }else if (num2<num1 & num2<num3){
            System.out.println(num2+ " is the smallest " +num1 + " and "  + num3);
        }else if (num3<num1 & num3<num2){
            System.out.println(num3+ " is the smallest  " +num1 + " and " + num2);
        }else if (num2==num1 & num2==num3) {
            System.out.println("They are all the same numbers ");
        }

    }
}
