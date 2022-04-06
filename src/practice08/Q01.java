package practice08;

import java.util.*;

public class Q01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");

        List<String> list = new ArrayList<>();

        String str = "";

        while ( !str.equals("*") ){
            str = scan.next();
            if(!str.equals("*")){
                list.add(str);
            }}

        System.out.println(list);

        //If they ask you to remove duplicated elements you can use sets
        Set<String> listSet = new HashSet<>(list);
        System.out.println(listSet);
    }
}
