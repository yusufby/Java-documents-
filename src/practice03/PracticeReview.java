package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeReview {
    public static void main(String[] args) {


        /* Create an integer array by the help of user(ask user length and elements of array)
         * Ask user the index of element that user wants to remove.
         * Print the array on the console after removing
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("length");

        int length = scan.nextInt();
        int arr[] = new int[length];

        int i = 0;



        do {
            System.out.println("Enter the element for index " + i);
            arr[i] = scan.nextInt();
            i++;
        } while (i < length);

        System.out.println(Arrays.toString(arr));

        System.out.println("Tell me the index you want to remove");
        int idx= scan.nextInt();

        if (idx<0 || idx> arr.length-1){
            System.out.println("invalid index");
        }else{
            int newArr[]= new int[length-1 ];

        }



    }
}
