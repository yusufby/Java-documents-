package day22inheritance;

/*
        1)To make a class child of another class we use "extends" keyword
        2)We create parent-child relationship;
            a)To prevent repetition
            b)To make maintenance easy
            c)To make our classes atomic

        3)Child classes can use the methods and variables from parent classes
          but parent classes cannot use anything from child classes

        4)A child can have parent, grandparent, grand grandparent, etc.
          A parent can have child, grandchild, grand grandchild etc.

        5) Every class except "Object Class"(Like Adam and Eve) has parent class in Java
        6) Java supports

         1-  "multi-level inheritance",
         2- "Hierarchical inheritance", and
         3- "Single Inheritance"

           Java does not support
                "multiple inheritance"

        7) When you create an object in Inheritance, all constructors in parent classes work from top to down
    */

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.feedBabyWithMilk();


        System.out.println("=========");
        Cat cat1 = new Cat();
        cat1.meow();
        cat1.eat();
        cat1.drink();
        cat1.feedBabyWithMilk();

        System.out.println("=========");

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.drink();
        bird1.eat();

    }


}
