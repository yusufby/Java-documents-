package day10forloopwhile;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args) {

        /*1.Example: Type code to find the sum of the integers from 12 to 231
         */
        int num = 0;

        for (int i = num; i < 232; i++) {
            num = num + i;


        }
        System.out.println(num);


        //2.Example: Type code to find the multiplication of the integers from 3 to 5
        int multiplication = 1;

        for (int i = 3; i < 6; i++) {
            multiplication = multiplication * i;
        }
        System.out.println(multiplication);


        System.out.println("=================");
        int a = 34343291;
        String str = String.valueOf(a);
        System.out.println(str);

        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int firstNum = 12;

        for (int i = firstNum; i < 68; i++) {
            System.out.print(i + " ");

        }
         /*
            3.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of rows and columns from user
        */

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a row");
//        int row= scan.nextInt();
//        System.out.println("Enter a column");
//        int column= scan.nextInt();
//
//        for (int i = 1; i <row+1 ; i++) {
//            for (int j = 1; j <column+1 ; j++) {
//            //    System.out.print("*");
//            }
//          //  System.out.println("*");

        System.out.println("----------------");

        /*1.Example: Type code to find the sum of the integers from 12 to 231
         */

        int number = 12;
        for (int j = number; j < 232; j++) {
            number = number + j;

        }
        System.out.println(number);

        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int firstnumber = 12;
        while (firstnumber < 68) {
            if (firstnumber % 2 != 0) {
                System.out.print(firstnumber + " ");

            }
            firstnumber++;
        }
        System.out.println("================");
        //3.Example: Type code to find the sum of integers from 12 to 67

        int j = 12;
        int sum = 0;

        while (j < 15) {
            sum = sum + j;
            j++;
        }
        System.out.print(sum);


        /*
         Type java code by using while loop,
         Write a program that prompts the user to input a number.
         It should then print the multiplication table of that number.
         3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
     */
        System.out.println("----");
        System.out.println("*****************");
Scanner scan =new Scanner(System.in);
        System.out.println("enter a number ");
        int birincinum= scan.nextInt();
        int ikincinum=1;

        while(ikincinum<11){

            System.out.println(birincinum + "*" + ikincinum +" =" + birincinum*ikincinum);
            ikincinum++;

        }
}}







