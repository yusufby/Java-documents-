package day32maps;

import java.util.Hashtable;

public class HashTable03 {
    public static void main(String[] args) {
        Hashtable<String , Integer> ht1=new Hashtable<>();
        ht1.put("Ali", 300);
        ht1.put("Tom", 500);
        ht1.put("Alexandra", 12000);
        ht1.put("Mark", 5000);
        ht1.put("Angelina", 23000);
        System.out.println(ht1);

        Hashtable<String , Integer> ht2=new Hashtable<>();
        ht2.put("Ali", 300);
        ht2.put("Tom", 500);
        ht2.put("Angelina", 23000);
        ht2.put("Alexandra", 12000);
        ht2.put("Mark", 5000);
        System.out.println(ht2);
        System.out.println(ht1.equals(ht2));//when we check the elements of 2 maps, it will not check
        //the order, but just values.

        System.out.println("--------------");

        System.out.println(ht1.size()==0);//this is not best way to check whether your map elements empty  or not
        System.out.println(ht1.isEmpty());//this is the best way to check your elemtns empty or not

    }
}
