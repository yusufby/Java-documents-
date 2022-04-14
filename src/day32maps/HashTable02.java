package day32maps;

import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Map;

public class HashTable02 {
    public static void main(String[] args) {
        /*Hashtable is a Map
        * HashTable is thread safe and synchronized
        * HashTable does not accept any null key nor values
        * HashTable does not put the elements in natural order.
        * HashTable is slower than  HashMap
        * */
        Hashtable<String , Integer> ht1=new Hashtable<>();
        ht1.put("Ali", 300);
        ht1.put("Tom", 500);
        ht1.put("Alexandra", 12000);
        ht1.put("Mark", 5000);
        ht1.put("Angelina", 23000);
        System.out.println(ht1);
       // ht1.put(null, 2000);  /
        /*if we use as key or value NULL, WE will get NULLPOINTEREXCEPTION*/

        System.out.println(ht1.containsKey("Angelina"));/*if we use containsKey for keys, it will return true or false */
        System.out.println(ht1.containsValue(100));/*if we use containsValue for value, it will return true or false */

        System.out.println("---------------");
        Hashtable<String , Integer> ht2=new Hashtable<>();
        ht2.put("Ali", 300);
        ht2.put("Tom", 500);
        ht2.put("Alexandra", 12000);
        ht2.put("Mark", 5000);
        ht2.put("Angelina", 23000);
        System.out.println(ht1.equals(ht2));


        for (Map.Entry<String,Integer> w: ht2.entrySet()){
            System.out.println(w);}






    }
}
