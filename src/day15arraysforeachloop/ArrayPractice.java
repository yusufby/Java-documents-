package day15arraysforeachloop;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        String srr[]= {"Ayhan","Ceyhan","Beyhan"};
        System.out.println(Arrays.toString(srr));


        String trr[]= new String[3];

        for (int i = 0; i < 3; i++) {
            trr[i]=srr[i];
        }
        System.out.println(("Before sort :" + Arrays.toString(trr)));

        Arrays.sort(trr);
        System.out.println("After sort" + Arrays.toString(trr));

        if (Arrays.equals(srr,trr)){
            System.out.println("natural order");
        }else{
            System.out.println("not in natural order");
        }







        }


    }


