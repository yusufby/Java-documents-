package day30collection.collection_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDeneme {
    public static void main(String[] args) {
        String[] isim={"yusuf", "fatma", "yakup", "lina"};
        System.out.println(Arrays.toString(isim));


        for (String value:isim){
            System.out.println(value);

            //How to add array to array list
            ArrayList<String> isim2=new ArrayList<>(Arrays.asList(isim));
            System.out.println(isim2);
            System.out.println("====");
        }
        Integer[] number={3,4,5,6,18,22,87};
        for (int value:number){
            System.out.println(value);
        }
        List<Integer> number2=new ArrayList<>(Arrays.asList(number));
        System.out.println(number2);

    }
}
