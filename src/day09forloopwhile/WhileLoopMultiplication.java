package day09forloopwhile;

import java.util.Scanner;

public class WhileLoopMultiplication {
    public static void main(String[] args) {

        System.out.println("Write a number for multiplication");
        Scanner scan =new Scanner(System.in);
        int num= scan.nextInt();
        int i=1;

        while (i<11){

            if (num<0){
                System.out.println("Write a number which is bigger than zero ");
                break;
            }else{ System.out.println(num+ "x" +i + " = " + num*i);
                i++;}

            }
        }




    }

