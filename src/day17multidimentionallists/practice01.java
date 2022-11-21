package day17multidimentionallists;

import org.testng.Assert;

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

        System.out.println("-----");
        ArrayList<String>l3=new ArrayList<String>();
        l3.addAll(list);
        System.out.println(l3);
        System.out.println("=====");
        l3.addAll(2,list1);
        System.out.println(l3);
        l3.remove(2);
        System.out.println(l3);
        boolean validation=l3.contains("Fatma");
        System.out.println(validation);
        System.out.println("------");
        list.clear();
        System.out.println(list);
        l3.set(0,"ne haber");
        System.out.println(l3);


        System.out.println("===");
        l3.set(5,"kimden haber");
        System.out.println(l3);

        int count =0;
      for (String w:l3){
          if (w=="yusuf"){
              count++;
          }
      }
          System.out.println(count);
        System.out.println(l3);

        System.out.println("=====");
        ArrayList<Integer> number=new ArrayList<Integer>();
        ArrayList<Integer> number2=new ArrayList<Integer>();

        number.add(43);
        number.add(87);

        number2.add(43);
        number2.add(87);
        System.out.println(number2);
        System.out.println(number);

        boolean correction=number.equals(number2);
        System.out.println(correction);






    }
}