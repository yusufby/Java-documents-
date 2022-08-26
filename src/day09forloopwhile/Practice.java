package day09forloopwhile;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers


        for (int i = 11; i < 45; i++) {

            System.out.print(i + " ");
        }

        System.out.println("==============");

        //4.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

        for (int i = 68; i > 13; i -= 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

            }
        System.out.println("=======================");
        //1.Example: Put * between 2 consecutive
        // characters and to the end in a String. For example; Java ==> J*a*v*a*
        String text="Java";
        for (int j = 0; j < text.length(); j++) {
            System.out.print(text.charAt(j)+"*");
        }
        System.out.println("----------------");
        //3.Example: Type code to print a String in reverse after removing spaces. For example; "Ali Can" ==> "naCilA"
        String example="Ali can kardas";
        String newVersion=example.replace(" ", "");

        for (int i =newVersion.length()-1 ; i >=0 ; i--) {
            System.out.print(newVersion.charAt(i));
        }



        //Write a number for multiplication
        System.out.println("==============");
        Scanner scan2 =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan2.nextInt();
        int i=1;

        while (i<11){
            if (num<0 ){
                System.out.println("enter a valid number");
                break;
            }else{
                System.out.println(num + "*" + i +"=" + num*i);
                i++;

            }
        }
    }

}





