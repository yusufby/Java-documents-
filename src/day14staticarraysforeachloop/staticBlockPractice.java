package day14staticarraysforeachloop;

public class staticBlockPractice {
    public staticBlockPractice(){
        System.out.println("this is constructor");
    }
    static {
        System.out.println("1.static block ");
    }

    static {
        System.out.println("2.static block");
    }

    public static void main(String[] args) {
        staticBlockPractice staticBlockPractice=new staticBlockPractice();
        System.out.println("this is main method ");
    }
}
