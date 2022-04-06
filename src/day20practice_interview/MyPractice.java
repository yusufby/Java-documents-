package day20practice_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4, 5, 6};

        double sum=0;
       if (array.length==0)
       {
           System.out.println("in valid data");
       }else{
           for (int w: array){
               sum= sum + w;
           }   double average = sum / array.length;
           System.out.println("the average" + average);

       }


        System.out.println(sum);


    }
}
