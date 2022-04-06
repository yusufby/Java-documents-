package practice02;

import java.util.Scanner;

public class PracticeMy03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  String name");
        String str = scan.nextLine();
        System.out.println("Enter a character");
        char c = scan.next().charAt(0);
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)
            ) {
                counter++;
            }
        }
        System.out.println(c +"is repeated" +counter +"times in the string ");



    }
}
