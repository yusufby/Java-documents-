package lambda_functional_programming;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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



}