package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        //Functional programming can be used only in arrays, collections and maps
        //But we can not use maps directly. we can convert map to collections to use entrySet()

            /*
        Lambda is a functional programming, we have had Lambda in Java with version 8
        Functional programming focuses on "What to do", with structured programming we focus on "How to do"
        Functional programming is used just with Collections and Arrays
        We cannot use Maps directly in functional programming, but we can convert Maps to Sets and use them
        we can use entrySet()
        structured programming is hard.
         */

        // lambda is functional programming.
        // collections are list, queue and set not map

        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        System.out.println();
        getMaxElement01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        getMinGreaterThanSeve01(l);
        System.out.println();
        getMinGreaterThanSeven02(l);
        System.out.println();
        sumOfSquare(l);
        System.out.println();
        cubes(l);
    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer> list){
        for(Integer w: list){
            System.out.print(w+" ");
        }
    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(functional)
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach( t -> System.out.print(t + " "));
        // why do we use steam ? to be able to use more methods
    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list){
        for(Integer w: list){
            if(w % 2 == 0 ){
                System.out.print(w+" ");
            }
        }
    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter( t -> t % 2 ==0).forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t ).forEach(t -> System.out.print(t  + " "));
    }// [8 9 131 10 9 10 2 8 15]
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    //elements should be distinct (unique number)
    //elements should be odd
    //elements printed as cube
         /*Map: key-value structure
            map: is a method
            for each : print the elements one by one

            * */
    public static void printCubeOfDistinctElements(List<Integer> list){
        list.stream().distinct().filter(t -> t %2 !=0).map(t -> t * t * t).forEach(t-> System.out.print(t +" "));
    }

    /*we use map method to have the square of the odd numbers */

    //Create  a method to find the maximum value from the list elements
    public static void getMaxElement01(List<Integer> list){
        Integer maxValue=list.stream().distinct().reduce(0,( t,u)->t> u ? t:u );
        System.out.println(" maximum value is " +maxValue);



    }
    //2.way
    public static void getMaxElement02(List<Integer> list){
        Integer maxVlue02= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)-> u);
        System.out.println(maxVlue02);
        /*distinct means repeated one will be shown only ones*/
        //distinct method selects the repeated elements one time
    }
//create a method to find the minimum value which is greater than 7 and even number from the list
    //1.way
    public static void getMinGreaterThanSeve01(List<Integer>list){
       Integer max= list.stream().distinct().
                                   filter(t-> t > 7).filter(t-> t%2==0).
                                   reduce(Integer.MAX_VALUE, (t,u)-> t>u ? u :t);
       System.out.println(max);
    }
    //2.way
    public static void getMinGreaterThanSeven02(List<Integer>list){
       Integer get02= list.stream().distinct().filter(t-> t>7).
                                    filter(t-> t%2==0).sorted(Comparator.reverseOrder()).
                                    reduce(Integer.MAX_VALUE,(t,u)-> u);
        System.out.println(get02);
}
//Create a method to  find the half of the elements which are distinct and greater than 5 in  reverse order in the list
    /*distinct, half of elements ,greater than 5, reverse , list */

    public static void halfOfElements(List<Integer>list){
    List<Double>newlist= list.stream().
            distinct().filter(t-> t>5).map(t-> t / 2.0)
            .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }//create an element to calculate the sum of the squares of distinct even elements
    public static void sumOfSquare(List<Integer>list){
        Integer even=list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t,u)-> t+u);
        System.out.println(even);
    }

    /*we use reduce method to add the numbers
    * if you have one number at the end we use reduce for multiplication, addition
    * max, min and average
    * when  you use reduce method , you will have a single value */

    //create an element to calculate product of the cubes of distinct of
    // even elements

    public static void cubes(List<Integer>list){
       Integer cube= list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t,u)-> t*u);
        System.out.println(cube );
    }
}
