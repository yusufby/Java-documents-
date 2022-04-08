package day28abstraction02;

public  class Teacher extends Person{
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    String name;
    int age;
    int weight;

    public Teacher(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void name() {
        System.out.println("teachers name " + name);

    }

    @Override
    public void age() {
        System.out.println("teachers age is " + age);

    }

    @Override
    public void weight() {
        System.out.println("teachers weight is " + weight);

    }
}
