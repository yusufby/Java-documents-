package day25overriding.practiceEncapsulationAndOverriding;

public class Vehicle {
    public void yakit(){
        System.out.println("her electricli arac benzin kullanir.");
    }
    public void yakitsiz(){
        System.out.println("her yakitsiz arac benzin kullanmaz.");
    }

    public Vehicle(){
        System.out.println("Every vehicle is valuable");
    }
}
