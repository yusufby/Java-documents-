package day33mapanditerators;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class Tree01 {



    public static void main(String[] args) {
        //TreeMap puts the entries in natural order.
        //TreeMap does not accept NULL key, but accepts multiple null values
        //TreeMap is not tread-safe and not synchronized
        //TreeMap is the slowest map in java as it uses natural order

     HashMap<String, Integer>hm1=new HashMap<>();
     hm1.put("Ali", 3000);
        hm1.put("Tom", 500);
        hm1.put("Alexandra", 12000);
        hm1.put("Mark", 5000);
        hm1.put("Angelina", 23000);
        hm1.put("Walker", null);
        hm1.put("Talker", null);

        TreeMap<String, Integer>htm2=new TreeMap<>(hm1);
        System.out.println(htm2);

        //What is the best way to place the elements of a map in natural order?









    }




}
