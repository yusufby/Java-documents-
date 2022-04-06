package day30collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String>q1= new LinkedList<>();

        q1.add("A");
        System.out.println(q1);//add method will trow exception but after offer method even
        // when you have unlimited data. it will give you false

        System.out.println(q1.offer("B"));//it gives you true or false result
        System.out.println(q1.size());
        System.out.println(q1);

        Queue<Integer>q2=new LinkedList<>();
        q2.add(43);
        q2.add(54);
        q2.add(14);
        q2.add(74);
        q2.offer(98);

        System.out.println(q2);

        System.out.println("========");
        q2.remove();
        System.out.println(q2);
        System.out.println("========");

        q2.element();
        System.out.println(q2);
        System.out.println("========");
        q2.peek();
        System.out.println(q2);
        System.out.println("========");
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);

        System.out.println("========");
        System.out.println(q2);
        q2.size();
        System.out.println(q2);


    }
}
