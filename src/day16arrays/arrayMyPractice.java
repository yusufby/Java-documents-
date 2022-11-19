package day16arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class arrayMyPractice {
    public static void main(String[] args) {
        String words="Every soul will taste of death you will as well";
        String[] arrayWords=words.split("");
        System.out.println(Arrays.toString(arrayWords));
        int counter=0;
        for (String array:arrayWords){
            if (array.equalsIgnoreCase("a")
                    ||array.equalsIgnoreCase("e")
                    ||array.equalsIgnoreCase("i")
                    ||array.equalsIgnoreCase("o")
                    ||array.equalsIgnoreCase("u")){
                System.out.print(array+" ");
                counter++;

            }
        }
        System.out.println("====");
        System.out.println(counter);

        String words1="Every soul will taste of death you will as wellY";
       String[] newWords=words1.split(" ");
        System.out.println(Arrays.toString(newWords));
        for (String w:newWords){
            if (w.endsWith("y")||w.endsWith("Y")){
                System.out.println(w+" ");
            }else {
                continue;
                //System.out.println("it is not correct");
            }
        }
        Arrays.sort(newWords, Comparator.comparingInt(String::length));
        System.out.println("--------");
        System.out.println(newWords[0]);
        System.out.println(newWords[newWords.length-1]);


        int[] deneme={23,42,75,98,99,44,31};
        int num=23;
        boolean condition=false;
        for (int w:deneme){
            if (w==num) {
                condition=true;
                break;
            }}
            if (condition){
                System.out.println("number exists");
            }else {
                System.out.println("it does not exist");
            }

        int idx = Arrays.binarySearch(deneme,num);
        System.out.println(idx);



    }
}
