package day09forloopwhile;

import java.util.Scanner;

public class WhileLoopFactorial {
    /*Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.*/

    public static void main(String[] args) {
        System.out.println("Enter a positive number");
        Scanner scan =new Scanner(System.in);
        int num= scan.nextInt();
        int i=1;
        int factorial=1;

        while (i<num +1){
            if (num<0){
                System.out.println("Enter a valid number ");
                break;
            }else{
                factorial=factorial*i;
                i++;
            }

        }System.out.println(factorial);


    }
}
