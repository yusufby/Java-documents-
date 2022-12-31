package day30collection;

import com.sun.source.doctree.SeeTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String>l1=new LinkedList<>();
        l1.add("fatma");
        l1.add("yakup");
        l1.add("yusuf");
        l1.add("fatma");
        l1.add("hasan");
        Collections.shuffle(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

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
        // how to print element one by one with for loop
        LinkedList<Integer> numbers=new LinkedList<>(ll3);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size()-1; i++) {
            System.out.print(numbers.get(i) +" ");
        }
        System.out.println("-----");
        // how to print element one by one with for each
        for (Integer e:numbers){
            System.out.print(e + " ");
        }
        System.out.println("====");
        Set<Integer>numberUnique=new TreeSet<>(numbers);
        System.out.println(numberUnique);





    }
}
