package day22inheritance.practice;

public class Runner {
    public static void main(String[] args) {
        Car car=new Car();
        car.carFast();

        Plane plane=new Plane();
        plane.planeFly();
        plane.vehicleCreatedMetal();
        plane.vehicleSystem();

        Tesla tesla=new Tesla();
        tesla.carFast();
        tesla.vehicleSystem();
    }
}
