package day30collection.collection_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDeneme {
    public static void main(String[] args) {
        ArrayList<Object>arrayList=new ArrayList<>();
        arrayList.add(3);
        arrayList.add("yusuf");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));

        arrayList.set(1, "fatma");
        boolean correct=arrayList.contains("4");
        System.out.println(correct);

        ArrayList<String> stringDeneme=new ArrayList<>();
        stringDeneme.add("yakup");
        stringDeneme.add("lina");
        stringDeneme.add("asel");
        stringDeneme.add("fatma");
        arrayList.addAll(stringDeneme);
        System.out.println(arrayList);
        Collections.sort(stringDeneme);
        System.out.println(stringDeneme);
        //reading element for loop
        for (int i = 0; i <stringDeneme.size() ; i++) {
            System.out.println(stringDeneme.get(i));

        }
        //reading element using for each
        for(Object e:arrayList){
            System.out.println(e);
        }

        //reading element using iterator
        System.out.println("=====");
        Iterator e=arrayList.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }
        Collections.sort(stringDeneme,Collections.reverseOrder());
        System.out.println(stringDeneme);
        Collections.shuffle(stringDeneme);

        //shuffle helps us to change the elements index randomly
        System.out.println(stringDeneme);




    }

}
