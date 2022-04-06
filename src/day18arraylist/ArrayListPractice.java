package day18arraylist;

import java.util.*;
/*
        Ask user to enter a letter
	 	If the letter exists in the list convert it to "Got it"
	 	otherwise, add the element user entered into the list
     */

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hi");
        list2.add("yusuf");
        list2.add("guven");
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        int minDifference= 1000;

        for (int i = 1; i <list.size() ; i++) {
            minDifference= Math.min(minDifference, list.get(i)-list.get(i-1));
        }
        for (int i = 1; i <list.size(); i++) {
if (list.get(i)-list.get(i-1)==minDifference);
            {
                System.out.println(list.get(i) - list.get(i-1));

            }
        }


    }
}
