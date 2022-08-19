package day07stringmanipulations;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  a text");
        String string = scan.nextLine();

        char firstCharacter = string.charAt(0);
        System.out.println(firstCharacter);

        char lastCharacter = string.charAt(string.length() - 1);
        System.out.println(lastCharacter);

        String someOfLetters = string.substring(1, 3);
        System.out.println(someOfLetters);

        int lastName = string.indexOf("y");
        System.out.println(lastName);

        String exist = "uf";

        if (string.contains(exist)) {
            System.out.println("it is true");
        } else {
            System.out.println("it is false");
        }

        String name = "Yusuf Bayram";
        String newName = name.concat(" Fatma and Yakup") + " BEBIS";
        System.out.println(newName);
        System.out.println(newName.endsWith("IS"));

        boolean firstLetter = name.startsWith("Y",
                0);
        System.out.println(firstLetter);


    }
}
