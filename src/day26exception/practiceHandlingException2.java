package day26exception;

public class practiceHandlingException2 {
    public static void main(String[] args) {
       String example="123a";
       convertIntToString(example);


    }

    public static void convertIntToString(String s){
        try {
            System.out.println(Integer.parseInt(s) );
        }catch (Exception e){
            System.out.println("there is something wrong"+ e.getMessage());
        }
    }
}
