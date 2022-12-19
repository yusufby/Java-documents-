package day30collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {

        /*Set is a collection that is used just for unique elements
        Hash is a technique to create unique codes for each data
        HashSet is a fast operation because they do not use any specific order for data
        HashSet accepts also null values*/
        HashSet<String> hs1 = new HashSet<>();

        hs1.add("k");
        hs1.add("k");
        hs1.add(null);


        System.out.println(hs1);
        System.out.println(hs1.size());

        HashSet<String> hs2 = new HashSet<>();

        hs2.add("k");
        System.out.println(hs2);

        HashSet<String> deneme=new HashSet<>();
        deneme.add("ali");
        deneme.add("");
        deneme.add(null);
        deneme.add("yusuf");
        deneme.add("yusuf");
        System.out.println(deneme);


        //interview question:type a code to display arraylist
        // elements only once

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(2);
        list.add(5);
        HashSet<Integer> list2 = new HashSet<>();
        list2.addAll(list);
        System.out.println(list2);
        list2.add(4);
        list2.add(4);
        list2.add(2);
        list2.add(9);
        list2.add(11);

        System.out.println(list2);
        System.out.println(list2.size());

        Set<Integer> set=new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(9);
        set.add(7);
        set.add(6);
        System.out.println(set);


    }
}
