package day17multidimentionallists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice01 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(34);
        l1.add(56);
        l1.add(21);
        System.out.println(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(23);
        l2.add(9);
        l2.add(45);
        l2.add(78);
        System.out.println(l2);
        l2.remove(0);
        System.out.println(l2);
        Integer sil=Integer.valueOf(45);
        l2.remove(sil);
        System.out.println("-------");
        System.out.println(l2);
        System.out.println(l1);

        System.out.println(l2.addAll(l1));

    }
}
