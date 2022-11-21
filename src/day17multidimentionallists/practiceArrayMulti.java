package day17multidimentionallists;

import java.util.Arrays;

public class practiceArrayMulti {
    public static void main(String[] args) {
        int[][] number = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int minimum = Integer.MIN_VALUE;

        for (int[]w:number){
            for (int y:w){
                if (minimum<y){
                    minimum=y;

                }
            }
        System.out.println(minimum);
        }



    }
}
