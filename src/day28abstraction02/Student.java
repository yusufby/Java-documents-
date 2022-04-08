package day28abstraction02;

public class Student extends Person {

    final String name;
    int age;
    int weight;


    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void name() {
        System.out.println("the name is " + name);

    }

    @Override
    public void age() {
        System.out.println("the age is " + age);
    }

    @Override
    public void weight() {
        System.out.println("the weight is " +weight);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
