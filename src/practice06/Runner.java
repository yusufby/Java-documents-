package practice06;

public class Runner {

    public static void main(String[] args) {


    Circle circle1= new Circle(2);
        System.out.println("Circle radius : " + circle1.getRadius());
        System.out.println("Area is " + circle1.getArea());

        System.out.println("=========");
        Circle circle2= new Circle(-2);
        System.out.println("Circle radius : " + circle2.getRadius());

    }

}
