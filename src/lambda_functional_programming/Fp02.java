package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fp02 {

    private static Object Utils;

    // variable or variables or zero variable -> logic
    // the structure is called " lambda expression
     /*
    In functional programming we can use "Lambda expressions" it is allowed, but it is not recommended
    Instead of "Lambda expressions", we prefer to use "Method reference"
    When we use method reference we have (" Class name :: method name ") Be careful about () -> we do not need
     */
    //for example: String : : length (do not write method Parenthesis
    // )
    // Arrays : : toString
    /*you can use your class.for example : you created animal clas
    * you have eat() method in a class.
     Animal : : eat
     * will be enough */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElements01(l);
        System.out.println();
        printElements02(l);
        printElements03(l);
        System.out.println();
        getElementsOnSeparateLine(l);
        System.out.println();



    }
    //Create a method to print the list elements on the console one by one
    public static void printElements01(List<Integer> list){
        list.stream().forEach( System.out :: print );
    }

    //Create a method to print the list elements on the console in the same line with a space
    //between two consecutive elements.
    public static void printElements02(List<Integer> list){
      /*  list.stream().forEach( Utils :: printInSameLineWithSpace );*/
//                        Class name :: method name
    }

    //Create a method to print all elements on a separate line with a star
    public static void printElements03(List<Integer> list){
        list.stream().forEach( lambda_functional_programming.Utils:: printElementsWithAStar);

        }

    //create a method to print the square of odd list elements on the console in the same line
    //with a space between two consecutive elements (functional)
    public static void printSquareOfOddElements(List<Integer> list){
    //    list.stream().filter(Utils::checkToBeOdd).map(Utils:: printElementsWithAStar);

    }
    /*Create a method to print the cube of distinct odd list elements on the
     * console in the same line with a space  between two consecutive elements*/
   public static void getElementsOnSeparateLine(List<Integer>list){
       list.stream().forEach(lambda_functional_programming.Utils::printElementsWithAStar);
   }

}

