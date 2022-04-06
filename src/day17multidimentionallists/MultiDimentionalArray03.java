package day17multidimentionallists;

import java.util.ArrayList;

public class MultiDimentionalArray03 {
    public static void main(String[] args) {

        //Find the maximum element in 2 dimensional array

        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };

        int x = Integer.MIN_VALUE;
        for (int[] w:a) {
            for (int m: w ) {
                if (x<m)
                {x=m;
                }
            }
            System.out.println(x);
        }
        ArrayList <Integer> id= new ArrayList<>();
        id.add(15);
        System.out.println(id);
        id.add(12);
        id.add(5);
    System.out.println(id);
    id.add(1,99);
        System.out.println(id);
        int numOfElements=id.size();


        if (id.isEmpty() ) {
            System.out.println("empty");
        }else{
            System.out.println("not empty");
        }

        ArrayList< String> al5= new ArrayList<>();
        al5.add("Christian");
        al5.add("Alex");
        al5.add("Tommy");
        al5.add("Adriana");
        al5.add("Tom");

        for (String w:al5) {
            al5.remove(w);
        }
        System.out.println(al5);






    }
}
