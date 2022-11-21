package day17multidimentionallists;

import java.util.Arrays;

public class practice02 {
    public static void main(String[] args) {
        String[][] kelime={{"yusuf"},{"yasin"},{"guven"}};
        System.out.println(Arrays.deepToString(kelime));
        Integer[][] number={{45},{65},{45},{79}};
        System.out.println(Arrays.deepToString(number));

        for (String[] w:kelime){
            for (String y:w){
                if (y.contains("yusuf")){
                    System.out.println(y);
                }
            }
        }

    }
}
