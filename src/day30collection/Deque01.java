package day30collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList<>();
        dq1.add("A");
        dq1.addFirst("B");
        dq1.addFirst("C");
        dq1.addLast("D");
        System.out.println(dq1);

        //how much  would you rate yourself out of 10 in java?
        //I know core java
        //string manipulations
        //data structures(collections and maps)
        //OOP concepts
        //exceptions
        System.out.println("=========");
        Deque<Integer> dq2=new LinkedList<>();
        dq2.add(32);
        dq2.addFirst(43);
        dq2.addFirst(65);
        dq2.addLast(22);
        dq2.add(66);

        System.out.println(dq2);



    }
}
