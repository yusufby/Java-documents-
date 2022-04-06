package day24objectmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name and surname");

        ArrayList<String>people= new ArrayList<>();

        Person person1=new Person("Yusuf ", "Koca");
        Person person2=new Person("Ali", "Sosa");
        Person person3=new Person("Mehmet", "Sengul");



    }
    List<String>generateEmail(List<Person>people){
        List<String> emails = new ArrayList<>();
        for(Person eachPerson:  people){
            emails.add((eachPerson.name+eachPerson.lastname+"@gmail.com").toLowerCase());//2
        }

        return emails;
    }
}

