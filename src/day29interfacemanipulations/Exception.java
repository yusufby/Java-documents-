package day29interfacemanipulations;

public class Exception extends Throwable {
    public static void main(String[]args)throws Exception{
        test();
    }


    public static void test(){
        try{
            //code here and my code cannot execute
            String numbers = "12345g";
            System.out.println(Integer.parseInt(numbers));

        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
