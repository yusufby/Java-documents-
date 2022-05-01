package day16arrays;

import java.util.Scanner;

/*Make an array that holds its actual values of the days of the week,
 and then have the user input a number corresponding to some day of the week.
  And assume that the week starts on Monday

Your program should output the String that represents the day of the week
that corresponds to the number that the user input.
For example, if the user inputs the number 1, your program should print “Monday”.*/


public class FindTheDaysOfTheWeek {

    public static void main(String args[]){
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = input.nextInt();
        input.close();

        System.out.println("Corresponding day: " + week[index - 1]);
    }
}
//All primitive data types can also be expressed as an object. it is called wrapper class.
//String is an object
