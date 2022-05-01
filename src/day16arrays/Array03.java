package day16arrays;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        /*
        Please split the dates and get day, month and the year separately on the console
        day : 25
        month : 02
        year : 2022
         */
        String date = "25/02/2022";
        String dateArray [] = date.split("/");
        System.out.println(Arrays.toString(dateArray));



        System.out.println("Day: " + dateArray[0]);
        System.out.println("Month: " + dateArray[1]);
        System.out.println("Year: " + dateArray[2]);

        //2.way:
        System.out.println(date.split("/")[0]); //25
        System.out.println(date.split("/")[1]); //02
        System.out.println(date.split("/")[2]); //2022

        //Dynamically typed langauges determine the data type of variables at runtime.
        // Statically typed languages determine the data type of variables at compile time.

        /*What is the purpose of the `var` keyword?
        To allow programmers to initialize a variable without having to explicitly declare its data type*/

        //. How does Java know the actual data type of a variable declared with `var`?
        //It infers(anlam cikarmak ) the data type by the value that is assigned to the variable
    }
    }
