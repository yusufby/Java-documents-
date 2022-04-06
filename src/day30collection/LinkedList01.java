package day30collection;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

        //print and see all the element on the console

        System.out.println(ll1);
        String firsElement = ll1.element();  //returns first element of the list
        //without removing any elements
        System.out.println(firsElement);

        String firstElement2 = ll1.poll();//returns the first element , but removing the element from the list (cut+ paste)
        System.out.println(firstElement2);

        System.out.println(ll1);

        String firstElement3 = ll1.peek();//returns the first element without removing the element(copy+paste)
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>();

        System.out.println(ll2);//returns noSuchElementException

        System.out.println(ll2.peek());//it returns null if it is no value.
        ll2.add("yusuf");
        ll2.add("fatma");

        System.out.println(ll2);

        LinkedList<Integer> ll3 = new LinkedList<>();

        ll3.add(0, 23);//i want to use order for the elements. i can place a specific indexes by list elements
        ll3.add(1, 54);
        ll3.add(2, 10);
        ll3.add(3, 67);
        System.out.println(ll3);

        Integer first1 = ll3.remove();//retrieve the first element and will remove it from the list


        Integer first2 = ll3.remove(2);
        System.out.println(ll3);

        ll3.add(12);
        ll3.add(11);
        ll3.add(34);

        System.out.println(ll3);
        ll3.removeFirstOccurrence(12);
        System.out.println(ll3);

        ll3.removeLastOccurrence(34);
        System.out.println(ll3);

        System.out.println("=================");
        LinkedList<Integer> ll4 = new LinkedList<>();

        ll4.add(23);
        ll4.add(11);
        ll4.add(4);
        ll4.add(87);
        System.out.println(ll4);
        ll4.removeAll(ll3);//when you use remove all method it compares
        // 2 collections and remove the same things only
        System.out.println(ll4);
        ll4.addAll(ll4);//it duplicates the values.
        System.out.println(ll4);
        System.out.println("=========");
        ll4.addAll(2, ll3);//adding all the elements  at a specific index
        System.out.println(ll4);
        ll4.addFirst(32);//add the add element first index
        System.out.println(ll4);

        ll4.addLast(56);
        System.out.println(ll4);

        ll4.set(3,200); // if you use set method it will replace with previous number of index
        System.out.println(ll4);



    }
}
