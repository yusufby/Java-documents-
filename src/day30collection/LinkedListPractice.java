package day30collection;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String>l1=new LinkedList<>();
        l1.add("fatma");
        l1.add("yakup");
        l1.add("yusuf");
        l1.add("fatma");
        l1.add("hasan");


        System.out.println(l1);
        System.out.println("=========");

        l1.element();
        System.out.println(l1);
        System.out.println("=========");
        l1.poll();
        System.out.println(l1);
        System.out.println("=========");

        LinkedList<String>l2=new LinkedList<>();

        System.out.println(l2);
        System.out.println("=========");
        System.out.println(l2.peek());
        System.out.println("=========");

        LinkedList<Integer> ll3 = new LinkedList<>();

        ll3.add(0,12);
        ll3.add(1,2);
        ll3.add(2,22);
        ll3.add(3,1);
        ll3.add(4,33);
        System.out.println(ll3);
        System.out.println("=========");
        ll3.remove();
        System.out.println(ll3);

        System.out.println("=========");
       ll3.removeFirst();
       ll3.removeLast();
        System.out.println(ll3);
        ll3.addAll(ll3);
        System.out.println(ll3);
        ll3.addAll(1,ll3);
        ll3.set(0,54);

        System.out.println(ll3);




    }
}
