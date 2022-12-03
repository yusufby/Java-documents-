package day24objectmanipulation.practiceOfObjectManipulation;

public class Deneme {

    String name;
    String surname;


    public Deneme(String name, String surname){
        this.name=name;
        this.surname=surname;


    }

    public static void main(String[] args) {
        Deneme deneme=new Deneme("yusuf", "bayram");
        System.out.println(deneme.name);
        System.out.println(deneme.surname);





    }
}
