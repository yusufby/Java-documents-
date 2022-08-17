package day05ifelsestatements;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a day ");
        String day=scan.nextLine();

        boolean weekday=day.toUpperCase().contains("Monday")
                || day.toUpperCase().contains("Tuesday")
                || day.toUpperCase().contains("Wednesday")
                || day.toUpperCase().contains("Thursday")
                || day.toUpperCase().contains("Friday");

        boolean weekend=day.toUpperCase().contains("Saturday")
                ||day.toUpperCase().contains("Sunday");
       if(weekday){
           System.out.println("weekday" );
       }else if(weekend) {
            System.out.println("weekend");
        }else {
           System.out.println("it is not valid");
       }

    }
}
