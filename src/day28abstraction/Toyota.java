package day28abstraction;

public class Toyota extends Car{


    String make="Toyota";
    String model="Cambry";
    int year= 2022;

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
