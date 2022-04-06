package day32maps;

import java.util.HashMap;
import java.util.Set;

public class HashMap03 {
    public static void main(String[] args) {
        HashMap<String , Integer> lessons=new HashMap<>();
        lessons.put("Maths", 8);
        lessons.put("Java", 9);
        lessons.put("SDLC", 9);
        lessons.put("Api", 7);
        lessons.put("Api", 8);
        lessons.put(null, 8);
        System.out.println(lessons);
        Set<String> set=lessons.keySet();

        System.out.println(lessons);
        System.out.println("-------");

        boolean isRight=lessons.remove("Java", 9);
        System.out.println(isRight);


    }
}
