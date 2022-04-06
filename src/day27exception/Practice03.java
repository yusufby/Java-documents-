package day27exception;

import java.util.Scanner;

public class Practice03 {
    /*take a character from the user and check whether this  character is vowel or not. Also handle uppercase and
     *lowercase of the character. and if the person does not type any  character then give the error that
     *  please enter the correct  input  */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        String letter= scan.nextLine().toLowerCase();

        if (letter.contains("a")||letter.contains("e")||letter.contains("i")||letter.contains("o")
                ||letter.contains("u")) {
            System.out.println("It has vowel");
        }else{
            System.out.println("it does not contain vowels");
        }




    }




}
