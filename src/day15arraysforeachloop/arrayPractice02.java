package day15arraysforeachloop;

import org.testng.internal.junit.ArrayAsserts;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

public class arrayPractice02 {
    public static void main(String[] args) {
    String[] ornek={"ali", "veli", "mehmet","yusuf", "bayram"};
        System.out.println(Arrays.toString(ornek));
       Arrays.sort(ornek, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(ornek));
        System.out.println("===========");

        String[] ornek2={"seni", "seviyor","degil mi", "haydi", "bakalim"};
        System.out.println(Arrays.toString(ornek2));

        Arrays.sort(ornek2, Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(ornek2));

        Arrays.sort(ornek2,Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println("--");
        System.out.println(Arrays.toString(ornek2));

        Arrays.sort(ornek2, Comparator.naturalOrder());
        System.out.println(Arrays.toString(ornek2));
        System.out.println("=====");
        String[] ornek3=new String[5];

        for (int i = 0; i < 5; i++) {
            ornek3[i]=ornek2[i];

        }
        System.out.println(Arrays.toString(ornek3));

        Arrays.sort(ornek3, Comparator.naturalOrder());
        System.out.println(Arrays.toString(ornek3));


        String[] sample={"23","34","53"};
        String[] ornek4=Arrays.copyOf(sample,3);
        System.out.println(Arrays.toString(ornek4));
        int[] arr={23,45,20, 86,76};
        for(int w:arr){
            if (w==23){
                System.out.println(w+ "exist");
                break;

            }



        }
        System.out.println("&&&&&&&&&&&&&");
        int[] sample2={23, 32,53,22,76,35};
        Arrays.sort(sample2);
        System.out.println(Arrays.binarySearch(sample2,768));

    }


}
