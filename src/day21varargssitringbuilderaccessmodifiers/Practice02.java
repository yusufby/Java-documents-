package day21varargssitringbuilderaccessmodifiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice02 {
    public static void main(String[] args) {
    StringBuilder stringBuilder=new StringBuilder("Ali");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        stringBuilder.append(" yusuf").append(" number");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println("=====");
        System.out.println(stringBuilder.lastIndexOf("e"));

        System.out.println(stringBuilder.indexOf("y"));

        stringBuilder.insert(3," yakup");
        System.out.println(stringBuilder);

        StringBuilder stringBuilder1=new StringBuilder("Ali yakup yusuf number");
        System.out.println(stringBuilder1.compareTo(stringBuilder));

        String newString=stringBuilder1.substring(4);
        System.out.println(newString);
        System.out.println("&&&&&&&&&&&&&");
        StringBuilder stringBuilder2=new StringBuilder(newString);
        System.out.println(stringBuilder2);
        List<Integer> number=new ArrayList<>();
        number.add(23);
        number.add(3);
        number.add(25);
        number.add(29);
        number.add(2);
        number.add(22);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

    int min=number.get(0);
    int max=number.get(number.size()-1);
        System.out.println(min);
        System.out.println(max);
    }



}
