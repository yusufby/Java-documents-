package day28abstraction;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Toyota();

        car.model();
        car.year();
        car.make();


        Car car2= new Honda();
        car2.make();
        car2.year();
        car2.model();



    }
}
