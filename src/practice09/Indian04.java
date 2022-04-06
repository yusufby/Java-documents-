package practice09;

import java.util.Scanner;

public class Indian04 {
    public static void main(String[] args) {
        //Write a program to display  the square of the numbers
        /*for example
        1,4,9,16.....*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Write the first number ");
        int first= scan.nextInt();

        System.out.println("Write the second number ");
        int second= scan.nextInt();
        int sum=0;

        for (int i = first; i <=second; i++) {
            System.out.println(i*i);
            sum=sum +i*i;
        }
        System.out.println("=======");
        System.out.println(sum);






    }
}
