package day09forloopwhile;

import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {
        //1.Example: Put * between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*
        String example = "Java";
        for (int i = 0; i < example.length(); i++) {
            System.out.print(example.charAt(i) + "*");
        }
        //2.Example: Type code to print unique characters in a String. Hello ==> Heo
        String t = "Everyone yusuf bayram";
        for (int i = 0; i < t.length(); i++) {
            if (t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))) {
                System.out.print(t.charAt(i));
            }


        }
        System.out.println("=-=-=====");
        String name = "Ali yusuf fatma yakup bebis";
        String name2 = name.replace(" ", "");
        System.out.println(name2);
        for (int i = name2.length() - 1; i > -1; i--) {
            System.out.print(name2.charAt(i));
        }
      /*Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();
        int factoriel=1;
        while(factoriel<number+1){
            if (number<0) {
                System.out.println("enter a valid number");
            }else{
                factoriel=factoriel*number;
                factoriel++;
                
            }

        }
        System.out.println(factoriel);




    }
}
