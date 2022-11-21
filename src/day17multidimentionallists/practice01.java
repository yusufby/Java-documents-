package day17multidimentionallists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Yusuf");
        list.add("Yakup");
        list.add("Fatma");
        list.add("Lina Asel");
        list.add("Salih ");
        list.add("baba");
        System.out.println(list);
        System.out.println("yusuf bayram");
        System.out.println("-----TATLIS------");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Yusuf");
        list1.add("Yakup");
        list1.add("Fatma");
        list1.add("Lina Asel");
        list1.add("Salih ");
        System.out.println(list1);
        list1.addAll(2,list);
        System.out.println(list1);
        System.out.println("&&&&&&&&&&&7");
        int i=1;
        String yakup="one person";
        System.out.println(yakup);
        System.out.println(i);



    }
}