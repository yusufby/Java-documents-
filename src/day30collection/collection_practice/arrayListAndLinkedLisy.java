package day30collection.collection_practice;

import java.util.ArrayList;
import java.util.Collection;

public class arrayListAndLinkedLisy {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(3);
        number.add(6);
        number.add(9);
        number.add(10);
        number.add(15);
        System.out.println(number);
        number.remove(3);
        System.out.println(number);
        number.removeAll(number);
        number.add(6);
        number.add(9);
        number.add(10);
        number.add(15);
        number.retainAll(number);
        number.addAll(number);
        System.out.println(number);
        System.out.println(number.isEmpty());
        System.out.println(number.size());
        System.out.println(number.contains(10));
        System.out.println(number.toArray());
        number.add(5,5);
        System.out.println(number);
        number.get(0);
        number.set(3,3);
        System.out.println(number);




    }
}
