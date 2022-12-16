package day29interfacemanipulations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPractice {
    public static void main(String[] args) {
        LinkedList<Integer> number=new LinkedList<>();
        number.add(0, 13);
        number.add(1, 12);
        number.add(2, 10);
        number.add(3, 17);
        System.out.println(number);
       number.poll();
        System.out.println(number);
        number.remove(2);
        System.out.println(number);
        number.add(54);
        number.peek();
        System.out.println(number);
        System.out.println("----");
        List<Integer>number2=new ArrayList<>();

        number2.add(0,2);
        number2.add(1,5);
        number2.add(0,3);
        number2.add(3,22);
        number2.add(4,26);

        System.out.println(number2);

        LinkedList<Integer> number3=new LinkedList<>();
        number3.element();
        System.out.println(number3);

    }
}
