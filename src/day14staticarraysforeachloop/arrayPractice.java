package day14staticarraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayPractice {

    public static void main(String[] args) {
        int[] arrayName = new int[5];
        System.out.println(Arrays.toString(arrayName));
        arrayName[1] = 23;
        arrayName[2] = 21;
        arrayName[3] = 2;
        arrayName[4] = 3;
        System.out.println(Arrays.toString(arrayName));

        System.out.println(arrayName[2]);

        int firstArray = arrayName[0];
        int lastArray = arrayName[arrayName.length - 1];
        System.out.println(firstArray);
        System.out.println(lastArray + firstArray);

        System.out.println("==========");
        int sum = 0;
        for (int i = 0; i < arrayName.length; i++) {
            sum = sum + arrayName[i];

        }
        System.out.println(sum);
        System.out.println("???????????");
        int sum2 = 0;
        for (int w : arrayName) {
            sum2 = sum2 + w;
        }
        System.out.println(sum2);

        System.out.println("String ==========");
        String[] name = new String[4];

        name[0] = "yusuf";
        name[1] = "fatma";
        name[2] ="yakup";
        name[3]="Lina Asel";
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        System.out.println("names one by one ");
        for (String w:name){
            System.out.println(w);
        }
        System.out.println("5  harften kucuk isimler ");
        for (String w:name){
            if (w.length()<6){
                System.out.println(w);
            }
        }
        System.out.println("fatmadan oncekiler");
            for (String w:name){
                if (w.contains("fatma")){
                    break;
                }
                System.out.println(w);
            }
        System.out.println("new practice ====");

            String[] newName=new String[5];
        System.out.println(Arrays.toString(newName));
        newName[0]="yusuf";
        newName[1]="fatma";
        newName[2]="yakup salih";
        newName[3]="lina asel";
        newName[4]="family";
        System.out.println(Arrays.toString(newName));
        System.out.println(newName[2]);
        System.out.println("======");
        for(String each:newName){
            System.out.println(each);
        }
        System.out.println("isimlerden bir tanesi ni cikarma ");
        System.out.println("===");
        for (String each :newName){
            if (each.contains("family")){
                continue;

            }
            System.out.println(each);
        }


    }
}
