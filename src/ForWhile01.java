import java.util.Scanner;

public class ForWhile01 {
    /*Ask user to enter a name and a character,
    then check how many times the character is
    repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2*/


    public static void main(String[] args) {

        String name = "Everything is going to be okay.";
        char character = 'e';
        System.out.println(name.toLowerCase().trim());
        int repeated = 0;

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.replaceAll(" ", ""));
        }
    }
}



