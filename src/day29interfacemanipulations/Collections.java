package day29interfacemanipulations;

import javax.swing.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Collections {

    /*
    If you need to use unique elements in a natural order, then use TreeSet
    it will sort the elements in ascending order
    HashSet is faster than TreeSet but TreeSet can also order the elements
     */

    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(12);
        ts1.add(35);
        ts1.add(10);
        ts1.add(46);
        ts1.add(9);
        System.out.println(ts1);//[9, 10, 12, 35, 46]

        /*
        How to store unique elements in natural order?
        I can use TreeSet
        Yes, but as you know TreeSet is so slow, how can you make it faster?
        I will first create a HashSet and add all elements to a HashSet
        Then I can covert them into a TreeSet and it will be faster

         */
        //1. way
        Long t1 = System.nanoTime();
        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("K");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("C");
        ts2.add("T");
        System.out.println(ts2);//[A, C, K, T, Z]
        Long t2 = System.nanoTime();
        //[A, C, K, T, Z]
        //[A, C, T, Z, K]
        //2. way
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
        System.out.println(hs1);

        TreeSet<String> ts3 = new TreeSet<>(hs1);
        System.out.println(ts3);//[A, C, K, T, Z]
        Long t3 = System.nanoTime();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);

        System.out.println("------------------");
        TreeSet<Integer> example=new TreeSet<>();
        example.add(5);
        example.add(7);
        example.add(10);
        example.add(3);
        System.out.println(example);

        HashSet<Integer>example2=new HashSet<>();
        example2.add(4);
        example2.add(2);
        example2.add(10);
        example2.add(9);
        System.out.println(example2);

        Long example2second=System.nanoTime();
        Long examplesecond=System.nanoTime();

        System.out.println(example2second);
        System.out.println(examplesecond);




    }
}
