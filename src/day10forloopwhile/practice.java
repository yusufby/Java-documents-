package day10forloopwhile;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //1.Example: Type code to find the sum of the integers from 12 to 231
        int i = 0;
        for (int j = 12; j < 232; j++) {
            i = j + i;
        }
        System.out.println(i);

        int ab = 423423423;
        String b = String.valueOf(ab);
        System.out.println(b);

        System.out.println("====");
        double ali = 34242.423423;
        String deneme = String.valueOf(ali);
        System.out.println(deneme);
        System.out.println(deneme.length());

        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
//        int oddNumber = 12;
//        while (oddNumber < 68) {
//            if (oddNumber % 2 != 0) {
//                System.out.print(oddNumber + " ");
//            }
//            oddNumber++;
//        }
       /* Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = 1;
        while (num2 < 11) {
            System.out.println(num + "*" + num2 + "=" + num * num2);
            num2++;
        }*/


        //1.Example: Type code to find the sum of the integers from 12 to 231
        int integer=0;
        for (int j = 12; j <232 ; j++) {
            integer=j+integer;
            j++;
        }
        System.out.println(integer);

        //3.Example:Type code to check if a given String is Palindrome.//          String: anna  Reversed String: anna
        String example="ala";
        String palindrom="";

        for (int j = example.length()-1; j >-1; j--) {
            palindrom=palindrom+ example.charAt(j);
        }
        if (palindrom.equals(example)){
            System.out.println("it is palindrom");
        }else {
            System.out.println("it is not palindrom");
        }
    //4.Example:Type code to check if a given integer is Palindrome.
    //          Integer: 12321  Reversed Integer: 12321

    int realNum=123291;
        String realNum2=String.valueOf(realNum);
    String palindromNum="";
        for (int j =realNum2.length()-1; j >-1 ; j--)
        {
            palindromNum=palindromNum+realNum2.charAt(j);}

        if(realNum2.equals(palindromNum)){
            System.out.println("dogru"); }else{
            System.out.println("yanlis");
        }

        //5.Example: Type code to find the sum of the digits of an integer
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  number");
        int abc= scan.nextInt();
        int sumOfUniqueDigits = 0;
        String abc2=String.valueOf(abc);

        System.out.println("===========");
        String hello="hello";
        for (int j = 0; j <5 ; j++) {
            System.out.println(hello);
        }
        System.out.println("====");

        int helloNumber=1;
        while (helloNumber<6){
            System.out.println("Hello");
            helloNumber++;
        }
        System.out.println("=============");
        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int number=12;
        while (number<68){
            if (number%2!=0){
                System.out.print(number + " ");
            }
                number++;
        }
        System.out.println("=====");
        //3.Example: Type code to find the sum of integers from 12 to 67
        int deger=12;
        int sum=0;
        while (deger<68){
            sum=sum+deger;

        deger++;
        }
        System.out.println(sum);


        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

    /*
         Type java code by using while loop,
         Write a program that prompts the user to input a number.
         It should then print the multiplication table of that number.
         3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
     */
        System.out.println("=======???/?");
        int carpim=0;
        System.out.println("write the number");
        int num= scan.nextInt();
        while (carpim<21)
        {
            System.out.println(num+"*"+carpim+"="+num*carpim);
            carpim++;
        }


        }


    }


