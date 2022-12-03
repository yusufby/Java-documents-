package day24objectmanipulation.practiceOfObjectManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> names=new ArrayList<>();
        List<String>surnames=new ArrayList<>();
        System.out.println("Enter 2 names");
        names.add(scan.nextLine());
        names.add(scan.nextLine());
        System.out.println("Enter 2 surnames");
        surnames.add(scan.nextLine());
        surnames.add(scan.nextLine());


        System.out.println( generateEmail(names,surnames));


    }
    public static List<String > generateEmail(List<String> name, List<String> surname){
        List<String>emails=new ArrayList<>();

        for (int i = 0; i <name.size() ; i++) {
            emails.add(name.get(i)+surname.get(i)+"gmail.com");

        }
        return emails;

    }





}
