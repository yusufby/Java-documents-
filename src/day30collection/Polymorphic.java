package day30collection;

import java.sql.SQLOutput;
import java.util.*;
/*Polymorphism in Java is the ability of an object to take many forms.
 To put it simply, polymorphism in Java allows us to perform the same action in different ways.
 Any Java object that can pass more than one IS-A test is polymorphic in Java.*/

public class Polymorphic {
    public static void main(String[] args) {

        List<String>list1=new ArrayList<>();
    list1.add("A");
    list1.add("B");

        List<String>list2=new LinkedList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list1);
        Long t1 = System.nanoTime();
        System.out.println(list2);
        Long t2 = System.nanoTime();
        System.out.println(t1);
        System.out.println(t2);
        Set<Integer>i=new HashSet<>();

}}
