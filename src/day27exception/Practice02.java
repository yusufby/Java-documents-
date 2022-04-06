package day27exception;

import java.util.Scanner;

 /*
    Make a login System in Java. I've a choice to get logged in using my
     (username or email) and password. Credentials are following:

    Username: faizan123

    faizan@gmail.com

    admin123

     */


public class Practice02 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String user="Yusuf";
        String emailAddress="yusufbayram@gmail.com";
        String pass="1234";


        System.out.println("Enter your username or email");
        String username= scan.nextLine();


        System.out.println("Enter your password");
        String password= scan.nextLine();
        if (username.equals(user) || username.equals(emailAddress) && password.equals(pass)){
            System.out.println("you are logged in ");

        }else{
            System.out.println("try again");
        }


}}
