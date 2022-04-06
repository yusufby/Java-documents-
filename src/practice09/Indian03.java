package practice09;

import java.util.Scanner;

public class Indian03 {
    public static void main(String[] args) {
        /*
        Write a program that takes input from the user and generates its mathematical table
        5*1=5
        5*2=10

        */
        Scanner scan =new Scanner(System.in);

        System.out.println("write first number ");
        int start= scan.nextInt();

        System.out.println("write second number ");
        int end= scan.nextInt();

        System.out.println("which table you want to multiple ");
        int num=scan.nextInt();

        int i;
        for ( i =start; i <=end ; i++) {
            System.out.println(num + " * " + i  + "=" + num*i );
        }


    }
}
