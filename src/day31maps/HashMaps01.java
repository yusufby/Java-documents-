package day31maps;

import java.security.KeyStore;
import java.sql.SQLOutput;
import java.util.*;

public class HashMaps01 {

    /*Create a HashMap and give key value pairs as following;
        Math = 8
        Java = 9
        SDLC = 9
        Api  = 7*/
    public static void main(String[] args) {
        //Maps use key value pairs structure
        //keys should be unique but values can be duplicate
        //in maps keys can not be NULL except HashMap.
        //in HashMap , you can use NUll only once for keys.
        //but you can have multiple NULLS for values
        //HashMap does not create elements in natural order that's why it is super fast.
        //HashMap is not thread-safe and it is not synchronized
        //When we use maps, it will return always value if we give key.


        //        KEY       VALUE
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(100, "Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Aliye");
        hm1.put(103, "Veliye");
        hm1.put(null, "Mary");
        hm1.put(null, "Kemal");
        hm1.put(104, null);
        hm1.put(105, null);
        hm1.put(106, "");

        System.out.println(hm1);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(87, "X");
        hm2.put(88, "K");
        hm2.put(89, "L");


        hm1.putAll(hm2); // this will ignore the order of elements when getting new map elements

        System.out.println(hm1);
        //when we merge elements of a Map to another, we have to use the same data types
        System.out.println("========");

        hm1.putIfAbsent(107, "z");//if this key does not exist, then create this with the new value
        System.out.println(hm1); /*if the key does not exist , then it will create new key value pair*/

        //HashMap does not care about natural order.


        System.out.println("=========================");
        String value=hm1.get(89);
        System.out.println(value);/*if the key exists then it will give the value */

        String value2=hm1.get(5000);
        System.out.println(value2); //if the key does not exist then it will  give NULL

        System.out.println("==========");
        String value3=hm1.getOrDefault(999, "there is no key like that");
        System.out.println(value3);//If you use getOrDefault ,
        // you have valid key, it will return value for the key.
        /*if you do not have  a valid key, it will return you custom message.there is no key like that
        * */
        System.out.println("===========================");
        Set<Integer> myKeys=hm1.keySet();//There is KeySet method returns a set
        System.out.println( "my keys" + myKeys);/*//I  get all the keys on the console*/
        //my keys[null, 100, 101, 102, 103, 87, 104, 88, 105, 89, 106, 107]

        System.out.println("=================");

        Collection<String> myValues=hm1.values();/*this will return collection for all values
        My values [Kemal, Ali, Veli, Aliye, Veliye, X, null, K, null, L, , z] */
        System.out.println( "My values " + myValues);
        System.out.println("--");

        /*IMPORTANT PART */
        Set<Map.Entry<Integer, String>> setForm= hm1.entrySet();
        System.out.println(setForm);
        System.out.println("====================");

        for (Map.Entry<Integer,String> w:setForm){
            System.out.println(  "Key : " + w.getKey());
            System.out.println(  "Value : " + w.getValue());//this gives key and values separately


        }

    }

}
