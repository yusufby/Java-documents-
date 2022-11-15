package day14staticarraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice02 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter number");
             int number=8;

        String[] name=new String[number];
        System.out.println(Arrays.toString(name));
        name[0]="ali";
        name[1]="veli";
        System.out.println(Arrays.toString(name));
        System.out.println("=====");

        int[] number2={23,45,26,98,4};
        System.out.println(Arrays.toString(number2));
        System.out.println(number2[3]);
        int[] number3={45,26,98,4,23};
        System.out.println("array true or false");
        boolean arrayCorrection=Arrays.equals(number2, number3);
        System.out.println(arrayCorrection);
        System.out.println("=====");
        Arrays.sort(number3);
        Arrays.sort(number2);
        if (Arrays.equals(number2, number3)){
            System.out.println("they are equal");
        }else {
            System.out.println("they are not equal");
        }


    }
}
