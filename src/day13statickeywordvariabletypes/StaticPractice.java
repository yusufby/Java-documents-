package day13statickeywordvariabletypes;


public class StaticPractice {

    public  static int counter=0;
    public   int counter2=0;

    public StaticPractice (){
        counter++;
        counter2++;
    }


    public static void main(String[] args) {
    StaticPractice staticPractice=new StaticPractice();
        System.out.println(staticPractice.counter2);
        System.out.println(counter);


        add(3,5);



    }
public  static int add(int a, int b){
        int c=2;
        return a+b+c;
}
}

