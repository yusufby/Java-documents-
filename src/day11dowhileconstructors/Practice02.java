package day11dowhileconstructors;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

        	/*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise, tell user "Lost!"
	    */
        Scanner scan = new Scanner(System.in);

        int i = 0;

        do {
            System.out.println("Enter and integer");
            i = scan.nextInt();
            if (i < 100) {
                System.out.println("Won");

            }} while (i<100);

        System.out.println("Lost");
    }


}
