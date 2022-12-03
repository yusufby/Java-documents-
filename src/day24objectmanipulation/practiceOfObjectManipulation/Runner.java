package day24objectmanipulation.practiceOfObjectManipulation;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String name=scan.nextLine();
        String surname=scan.nextLine();

        System.out.println(email(name, surname));



    }

    public static String email(String name, String surname){
        return name+surname +"gmail.com".toLowerCase();

    }


}
