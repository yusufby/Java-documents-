package day22inheritance;
//The class name before the "extends" keyword is the child class
//The class name after the "extends" keyword is the parent class
public class Dog extends Mammals {
    public void bark(){
        System.out.println("Dogs bark...");
    }
    public Dog(){
        System.out.println("Dog constructor");
    }

}
