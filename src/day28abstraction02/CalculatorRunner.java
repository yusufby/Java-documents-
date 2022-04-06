package day28abstraction02;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calculator=new Profit();
        //Polymorphism, Inheritance,  Abstraction

        Calculator calculator1=new Loss();


        System.out.println(calculator.addition(4,3));
        System.out.println(calculator.subtraction(4,3));
        System.out.println(calculator.multiplication(4,3));

        System.out.println(calculator1.addition(4,3));

    }
}
