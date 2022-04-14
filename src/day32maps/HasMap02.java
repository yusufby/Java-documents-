package day32maps;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMap02 {

    public static void main(String[] args) {
        /*Create a HashMap and give key value pairs as following;
        Math = 8
        Java = 9
        SDLC = 9
        Api  = 7  */
        HashMap<String , Integer> lessons=new HashMap<>();
        lessons.put("Maths", 8);
        lessons.put("Java", 9);
        lessons.put("SDLC", 9);
        lessons.put("Api", 7);
        System.out.println(lessons);

        Set<String> set=lessons.keySet();//it returns set.

        for (String w:set){
            System.out.println(w);
        }

        Collection<Integer> values=lessons.values();//return collection

        for (Integer w:values){
            System.out.println(w);
        } ;
//set of key value pairs
        System.out.println("==================---------------");
        Set<Map.Entry<String, Integer>> setForm =lessons.entrySet();
        System.out.println(setForm);

        /*IMPORTANT*/  // for each loop can be used in set not in map
        for (Map.Entry<String,Integer> w:setForm){
            System.out.println(w);
        }
        System.out.println("--------------");

        for (Map.Entry<String,Integer> w:setForm) {
       //     if (w.getKey().equalsIgnoreCase("java"))//
            /** how to get a specific value on the console*/
         //   System.out.println("java result is " + w.getValue()) ;
            if (w.getValue()>8){
                System.out.println(w.getKey()); //how to get a key which value is bigger than 8
            }
            System.out.println("*****************");
            System.out.println(lessons.get("Java"));
            /*when we use maps, we can just print them as a map .
            * when we use maps , we can use KeySet method to have only keys of the map
            * when we use maps, we can get all using values
            * when we want to get a specific value from map, we use get()
            * when we want to have all key value entries, we use EntrySet. */

            System.out.println("all keys " + lessons.keySet());//returns Set
            System.out.println("---------------");

            System.out.println("all values" + lessons.values());//Collection
            System.out.println("---------------");

            System.out.println("key pairs " + lessons.entrySet());//Set<Map.Entry><>
            System.out.println("---------------");
            System.out.println("one value of the map " + lessons.get("Maths")); //String

            int value= lessons.replace("SDLC", 10);
            System.out.println("Older value " + value); // replace method will 2 parameters returns me old =value of given key
            if (value==9)

            System.out.println("&&&&&&&&&&&&&&&");
            System.out.println(lessons);
            /*this method will take the key and value  and it will check 2 conditions. if the conditions are true
            * then it will  replace the value otherwise, i will not make any changes */
           boolean isTrue= lessons.replace("SDLC", 10,7);

            System.out.println(isTrue);

            System.out.println("--------------");
            /*How to remove element from MAP*/
            //    lessons.remove("Maths");
            //  System.out.println(lessons);
            /*How to remove element based on key value pair*/

           // lessons.remove("Java", 9);
            //System.out.println(lessons);




        }





    }
}
