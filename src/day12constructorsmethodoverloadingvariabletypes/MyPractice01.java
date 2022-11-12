package day12constructorsmethodoverloadingvariabletypes;



public class MyPractice01 {
    String math;
    String chemistry;
    double price;
    int lessonHour;

    public MyPractice01(){

    }

    public MyPractice01(String math, String chemistry, double price, int lessonHour){
        this.math=math;
        this.price=price;
        this.chemistry=chemistry;
        this.lessonHour=lessonHour;

    }

    public static void main(String[] args) {
    MyPractice01 myPractice01=new MyPractice01();

    myPractice01.lessonHour=5;
    myPractice01.price=10;
    myPractice01.chemistry="difficult";
    myPractice01.math="important";

    MyPractice01 myPractice02=new MyPractice01("inasda", "diffeasda", 5,10);



    }


}



