package day27exception;

public class E02 {
     /*
    Note: If Exceptions happen visible on the console after running the code,
     the Exceptions are called "Run Time Exceptions"
                  The other name of "Run Time Exceptions" is "Unchecked Exceptions"
                  Followings are "Run Time Exceptions"
                  1)ArithmeticException
                  2)ArrayIndexOutOfBoundsException
                  3)NullPointerException
                  4)NumberFormatException
                  5)StringIndexOutOfBoundsException
                  6)ClassCastException
     */


    public static void main(String[] args) {

        Object obj = 70;

        convertObjectToString(obj);// ClassCastException ==> Integer cannot be cast to String

        int i=90;
        convertObjectToString(String.valueOf(i));

    }

    public static void convertObjectToString(Object obj) {

        try {
            String s = (String) obj;
            System.out.println(s);
        } catch (ClassCastException e) {
            System.out.println("Conversion is impossible between those data types ==> " + e.getMessage());
        }
    }
}
