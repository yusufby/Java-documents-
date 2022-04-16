package MyJavaQuestions;

import java.util.Scanner;

public class Q02_IfNestedQuestion {
    /*
     * NESTED IFS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */
    public static void main(String[] args) {

        // what we know
        int minSalary=30000;
        int currentJob=2;


        // what we do not know
        System.out.println("Enter your salary ");
        Scanner scan =new Scanner(System.in);
        double earn= scan.nextDouble();
        System.out.println("Enter How many years you have been working ");
        int yearOfWork= scan.nextInt();

        // if statement
        if (earn>=minSalary){
            if (yearOfWork>=currentJob){
                System.out.println("You are qualified for a loan ");
            }else {
                System.out.println("You are not qualified for a loan. Because of year ");

            }
        }else {
            System.out.println(" You need to earn minumum " + minSalary + " in a year in order to have  a loan  ");
        }





    }
}
