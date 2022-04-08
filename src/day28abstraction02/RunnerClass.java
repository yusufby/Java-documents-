package day28abstraction02;

public class RunnerClass {
    public static void main(String[] args) {

        Person person01=new Student("Yusuf", 34, 80);
        Person person02=new Student("Hasan", 66, 86);
        Student std1=new Student("Ayhan",  44, 70);
        Person teacher=new Teacher("Ali", 43, 90);

       std1.name();
       std1.age();
       std1.weight();

        System.out.println( "name : " + std1.name + " age :  " + std1.age+ " weight :  " + std1.weight);

        System.out.println(std1.name);
        System.out.println(person01);
        System.out.println(teacher);



    }
}
