package practice09;

import java.util.Scanner;

public class Indian05 {
    public static void main(String[] args) {
        //take the input number from the user print its factorial

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to see its factorials");
        int num= scan.nextInt();
        int factorial=1;
        for (int i = 1; i <=num ; i++) {
            factorial=i * factorial;

        }System.out.println("factorial of " + num+ " is " + factorial);





    }
}
