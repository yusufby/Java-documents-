package day24objectmanipulation.practiceOfObjectManipulation;

import java.util.Scanner;

public class Runner3 {
    /*   /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate  firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Name");
        String ad=scan.nextLine();
        System.out.println("Surname");
        String soyad= scan.nextLine();
        System.out.println(email(ad,soyad));


    }

    public static String email(String name, String surname){

        return (name+surname+"gmail.com").toLowerCase();
    }

}
