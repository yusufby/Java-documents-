package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaPractice {
    public static void main(String[] args) {

        List<Integer> l1=new ArrayList<>();
        l1.add(12);
        l1.add(15);
        l1.add(18);
        l1.add(18);
        l1.add(21);
        l1.add(29);
        l1.add(134);

        Functional(l1);
        System.out.println();
        FunctionalEven(l1);
        SquareElement(l1);
        System.out.println();
        CubeOfElement(l1);
        System.out.println();
        ProductOfCubes(l1);
        MaxValue(l1);
        MinValue(l1);

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println("================");
        System.out.println(allElement01(l));
        System.out.println("-------------------");
        System.out.println(containNotXElement(l));
        System.out.println("-------------------");
        System.out.println(containRLetter(l));

    }
   public static void Functional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+ " "));
   }
    public static void FunctionalEven(List<Integer>list2){
        list2.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+ " "));
    }
    public static void SquareElement(List<Integer>list03){
        list03.stream().filter(t->(t%2)!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
    }
    public static void CubeOfElement(List<Integer>list05){
        list05.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t-> System.out.print(t + " "));
    }
    public static void ProductOfCubes(List<Integer>list){

    }
    public static void MaxValue(List<Integer>list){
     Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t: u);
        System.out.println(max);


    }
    public static void MinValue(List<Integer>list){
        Integer min=list.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)->t<u ? t : u );
        System.out.println(min);

        //7)Create a method to find the minimum  value from the list elements (Method Reference )

    }
    public static void minimumValue(List<Integer>list){
        Integer minimum=list.stream().distinct().reduce(Integer.MAX_VALUE, Math ::min);
        System.out.println(minimum);


    }
//Create a method to check if the lengths of all elements are less than 12
    public static boolean allElement01(List<String>list){
       return list.stream().allMatch(t-> t.length() < 12);

    }
    public static boolean containNotXElement(List<String>list){
        return list.stream().noneMatch(t-> t.contains("X"));
    }
    public static boolean containRLetter(List<String>list){
        return list.stream().anyMatch(t-> t.startsWith("C"));
    }

    }
