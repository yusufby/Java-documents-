package practice02;

import java.util.Scanner;

public class PracticeMy02 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
         int num = scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            if((i&3)==0 & i%5==0) {
                System.out.print("Rockstar");
            }else if (i%3==0) {
                System.out.print("Rock");
            }else if (i%5==0 ){
                System.out.print("Star");
            }else {
                System.out.print(i + " ");
            }
            
        }
      




        
}}
