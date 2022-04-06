package replitquestions;

import java.util.Scanner;

/*Write a code that returns the duplicate chars in a String array.(interview Question)
Input :
String str=“Javaisalsoeasy”
Output: [a, s] */
public class Q03 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name ");
    String str= scan.next();
        System.out.println("Enter a character ");
    String character= scan.next();

    int counter=0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==character.charAt(0)){
                counter++;
            }
        }
        System.out.println("char is repeated:  " +counter);



    }
}
