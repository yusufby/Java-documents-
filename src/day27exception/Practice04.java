package day27exception;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        /*write a program that takes the number from the user and
        tell us what day comes from the whole week */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see the day ");

        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("ENTER A VALID DATA");

        }


    }
}
