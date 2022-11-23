package day17multidimentionallists;

import java.util.ArrayList;
import java.util.Arrays;

public class practiceArrayMulti {
    public static void main(String[] args) {
       int[] array1=new int[3];
       array1[0]=1;
       array1[1]=2;
       array1[2]=3;
        System.out.println(Arrays.toString(array1));
        System.out.println(array1[2]);

        ArrayList<Integer> array2=new ArrayList<>();
        array2.add(2);
        array2.add(5);
        System.out.println(array2);
        array2.set(1,1);
        System.out.println(array2);






    }
}
