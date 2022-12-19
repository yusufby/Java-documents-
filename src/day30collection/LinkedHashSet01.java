package day30collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    public static void main(String[] args) {
/*//HashSet is an unordered & unsorted collection of the data set,
whereas the LinkedHashSet is an ordered and sorted collection of HashSet.
HashSet does not provide any method to maintain the insertion order.
 Comparatively, LinkedHashSet maintains the insertion order of the elements.*/

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(32);
        lhs.add(12);
        lhs.add(22);
        lhs.add(32);
        lhs.add(2);
        lhs.add(9);

        System.out.println(lhs);

        HashSet<Integer>lh2=new HashSet<>();
        lh2.add(32);
        lh2.add(12);
        lh2.add(22);
        lh2.add(32);
        lh2.add(2);
        lh2.add(9);

        System.out.println(lh2);

        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(232);
        list.add(231);
        list.add(23);
        System.out.println(list);

        //Interview= display all the arraylist elements at once on the console

        LinkedHashSet<Integer>lh3=new LinkedHashSet<>();
        System.out.println("=========");
        lh3.addAll(list);
        System.out.println(lh3);

        // if you want make things faster and easier use set





    }
}
