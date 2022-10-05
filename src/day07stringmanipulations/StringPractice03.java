package day07stringmanipulations;

public class StringPractice03 {
    public static void main(String[] args) {
        String name="";

        boolean nameCheck=name.isEmpty();
        if (nameCheck==true){
            System.out.println("you did not enter your name");
        }else {
            System.out.println("you entered your name ");
        }
        System.out.println("===========");
        int number2=name.length();
        if (number2==0){
            System.out.println("you did not enter your name");
        }else {
            System.out.println("you entered your name ");
        }
        System.out.println("=====");
        String ses="     ";
        boolean  control=ses.isBlank();
        System.out.println(control);

    }
}
