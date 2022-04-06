package day30collection;

import java.util.*;

public class HasSetPractice {
    public static void main(String[] args) {
        HashSet<Integer>i=new HashSet<>();
        i.add(33);
        i.add(23);
        i.add(38);
        i.add(33);
        i.add(23);
        i.add(39);
        System.out.println(i);
        System.out.println("=========");
        TreeSet<Integer>i2=new TreeSet<>(i);
        System.out.println(i2);
        System.out.println("======");

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(45);
        list.add(8);
        list.add(2);
        list.add(5);
        System.out.println(list);
       HashSet<Integer>listUnique=new HashSet<>(list);
        System.out.println(listUnique);
        System.out.println("========");
        TreeSet<Integer>list2=new TreeSet<>(list);
        System.out.println(list2);
        System.out.println("=======");
        Set<Integer>set=new HashSet<>();
        set.add(43);
        set.add(23);
        set.add(51);
        set.add(54);
        set.add(10);
        set.add(33);
        System.out.println(set);





    }
}
