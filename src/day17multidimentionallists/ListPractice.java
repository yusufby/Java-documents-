package day17multidimentionallists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListPractice {
    public static void main(String[] args) {
        String myArr[][] = {{"learn", "java", "it"}, {"is", "easy"}};
        int myArr2[][] = new int[2][3];
        System.out.println(Arrays.deepToString(myArr));
        System.out.println(Arrays.deepToString(myArr2));

        for (String[] w : myArr) {
            for (String m : w) {
                if (m.contains(" ")) ;
                {
                    System.out.println(m + " ");
                }
            }
        }
        int sum2=0;
        for (String[] w:myArr){
            sum2=sum2 + w.length;

        }
        System.out.println(sum2 );


        String [] myString={"hello", "dasdas","dasdasd","adasda"};
        System.out.println(Arrays.toString(myString));


    }
}





