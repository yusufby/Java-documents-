package MyJavaQuestions;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*Create a program that asks a user for a season of the year, then a whole number,
         then an adjective. And use the input to complete the sentence below. Output the result.*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a season of the year");
        String season= scan.next();

        System.out.println("Enter a whole number");
        int wholeNum= scan.nextInt();

        System.out.println("Enter an adjective");
        String adjective= scan.next();

        scan.close();

        System.out.println("Season= " + season + " Whole number= " + wholeNum + " adjective= " + adjective);











    }
}
