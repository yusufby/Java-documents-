package practice09;

import java.util.Scanner;

public class Indian02 {
    public static void main(String[] args) {

        /*Write a program that takes starting and ending number from the user and sum
        range of that numbers
        example:
        start:5 ending :12
        5+6+7+.....+12
         */
        Scanner scan =new Scanner(System.in);

        System.out.println("write first number ");
        int first= scan.nextInt();

        System.out.println("write second number ");
        int second= scan.nextInt();

        int i, sum=0;
        for (i=first ; i<=second; i++){
            sum=sum+i;

        }
        System.out.println(sum);




    }
}
