package day26exception;

public class practiceHandlingException {

    public static void main(String[] args) {
       division(100,0);

    }

    public static void division(int a, int b){
        try {
            System.out.println(a/b);
            System.out.println("hi guys ");

        }catch (Exception e

        ){
            System.out.println("Ewveryting is going to be okay"+ e.getMessage());
        }

    }
}
