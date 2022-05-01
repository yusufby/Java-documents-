package day16arrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //Put each word to an array as an element
        String words = "I go to school";
        String array [] = words.split(" ");
        System.out.println(Arrays.toString(array));


        String name = "Sevval#Mustafa#Suat#Fatmanur";
        String nameArray [] = name.split("#");
        System.out.println(Arrays.toString(nameArray));

        String sentence = "Learn Java earn money";
        String arrSentence [] = sentence.split(" ");
        System.out.println(Arrays.toString(arrSentence));

        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.
        String sent = "I go to school and I talk to friends and I talk to teachers";
        String arr [] = sent.split("and");
        System.out.println(Arrays.toString(arr));
    }
    //What is a constant variable?
    /*An array is a container object that holds a fixed number of values of a single type.*/
    //A variable whose value does not change throughout the execution of the program
    /*The length of an array is established when the array is created. After creation, its length is fixed.*/
    //By convention, how is a constant variable's name defined? all uppercase
}
