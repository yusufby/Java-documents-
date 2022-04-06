package day21varargssitringbuilderaccessmodifiers;

import java.util.ArrayList;
import java.util.Collections;

public class MyPractice {

    protected int a=13;
    public int b=13;
    private int c=13;
    int d= 13;



    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Veli");
        System.out.println(str);

        str.append(" Yusuf").append(" Hi guys").append("Hello world ");
        System.out.println(str);
        System.out.println(str.length());

        System.out.println("Empty" + str.capacity());
        System.out.println("=========");
        StringBuilder stringNew= new StringBuilder(5 );
        stringNew.append("Yusuf");

      ;
        System.out.println( stringNew.capacity());
        System.out.println(stringNew.lastIndexOf("f"));
        System.out.println(stringNew.lastIndexOf("u" , 3 ));
        System.out.println(stringNew.insert(2, "xxx"));
        System.out.println(stringNew.insert(1, "12232", 1,3));
        System.out.println(stringNew.delete(4,7));
        System.out.println(stringNew.deleteCharAt(1));
        System.out.println(stringNew.indexOf("u"));
        System.out.println(stringNew.replace(2,3 ,"$"));
        System.out.println(stringNew.reverse());

        StringBuilder sb5 = new StringBuilder( "Ali Can ");
        StringBuilder sb6 = new StringBuilder( "Ali Can");
           StringBuilder sb7 = new StringBuilder( "bli Can");
        System.out.println(sb5.compareTo(sb7));

        String stringFromStringBuilder= str.toString();

        ArrayList<Integer> list= new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23)
        ;
        list.add(-2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list
        );

        



         



        


    }
}
