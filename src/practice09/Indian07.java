package practice09;

import java.util.Scanner;

public class Indian07 {
    public static void main(String[] args) {
/*Write a program that generates the random number and ask the user to guess
* the number. if the user guess the number of very high range from the random\
* number then notify the user that the guess number is too high. if the user
* guess the number very low from random number then also notify the user that
* the number is too low*/
        Scanner scan =new Scanner(System.in);
        int num,guess,tries=0;

        //Generating the random number Range between 1 to 10

        num=(int) (Math.random() *100) +1;
        System.out.println("guess the number within the range of 1 to 10 ");

        do {
            //getting user input
            guess= scan.nextInt();
            tries++;
            if (guess>num){
                System.out.println("oh guess number is too high from random generaa");
            }else if (guess<num){
                System.out.println("oh guess number is too low from randow generated number");
            }else {
                System.out.println("Great! ");
            }

        }while (guess!=num);






    }
}
