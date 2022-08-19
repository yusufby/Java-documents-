package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scan.nextInt();

        switch (number) {
            case 1: {
                System.out.println("odd number");
            }
            break;

            case 2: {
                System.out.println("even number");
            }
            break;
            default: {
                System.out.println("enter a valid number");

            }
            break;


        }


    }
}
