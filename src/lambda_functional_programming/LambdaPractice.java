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

    }
