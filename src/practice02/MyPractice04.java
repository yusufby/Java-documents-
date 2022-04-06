package practice02;

import java.util.Scanner;

public class MyPractice04 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scan =new Scanner(System.in);


        int i= scan.nextInt();


        while(i%10!=0) {
            System.out.println(i);
            i++;

        }
        System.out.println(i);





    }
}
