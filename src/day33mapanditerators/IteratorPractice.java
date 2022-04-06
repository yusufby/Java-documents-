package day33mapanditerators;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {

        Set<String>set=new HashSet<>();

        set.add("ALI");

        set.add("VELI");

        set.add("HI");
        Iterator iter= set.iterator();

        while (iter.hasNext()){
            Object element=iter.next();
            System.out.println(element);
            System.out.println("====");
             iter.remove();
        }

    }
}
