package day28abstraction;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal1=new Cat("it says mea av", "tom");
        Animal animal2=new Sheep("it says meeee" , "Coban");

        animal1.animalSound();
        animal1.animalName();

        animal2.animalName();
        animal2.animalSound();








    }



}
