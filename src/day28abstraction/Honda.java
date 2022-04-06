package day28abstraction;

public class Honda extends  Car{
    String make="Honda";
    String model="Camb";
    int year= 2021;


    @Override
    public void make() {
        System.out.println("my car is " +make);
    }

    @Override
    public void model() {
        System.out.println("my model is " + model);
    }

    @Override
    public void year() {
        System.out.println("the year is " + year);
    }
}
