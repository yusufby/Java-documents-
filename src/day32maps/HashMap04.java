package day32maps;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap04 {
    public static void main(String[] args) {
        /*
Create a MAP that will have following keys and values
Math = 9
English = 8
Biology = 7
History = 6
French = 7
Then print all lessons and their scores that are more than 7
 */
        HashMap<String, Integer> lesson = new HashMap<>();
        lesson.put("Math", 9);
        lesson.put("English", 8);
        lesson.put("Biology", 7);
        lesson.put("History", 6);
        lesson.put("French", 7);
        System.out.println(lesson);
        System.out.println("=======================");
        Set<String>myKeys=lesson.keySet();
        System.out.println("myKeys"+ myKeys);

        System.out.println("=======================");

        Collection<Integer>myValues=lesson.values();
        System.out.println( " myValues"+ myValues);
        System.out.println(myValues.size());
        for (Integer w:myValues){
            if (w>7){
                System.out.println("Value is " + w);

            }

            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%5");
            Set<Map.Entry<String , Integer>>setForm =lesson.entrySet();
            for (Map.Entry<String,Integer> k:setForm)
            {if (k.getValue()>7){
                System.out.println(k.getValue());
                System.out.println(k.getKey());
            }
            }



        }








    }
}

