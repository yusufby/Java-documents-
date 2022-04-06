package day14staticarraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("How many elements will you store inside the array? ");
        int len= scan.nextInt();

      String sArray[]= new String[len];
        System.out.println(Arrays.toString(sArray));




    }
}
