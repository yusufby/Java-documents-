package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp05 {
    public static void main(String[] args) {
        System.out.println(getSumFromSevenToHundred());
        System.out.println();
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(findMultiplication());
        System.out.println();
        System.out.println(factorial(4));
        System.out.println();
        System.out.println(factorial02(-4));
        System.out.println();
        System.out.println(sumOfIntegers(3,6));
        System.out.println();
        System.out.println(findSumOfDigitsForTheIntegersInTheGivenRange(23,32));

    }


    //create a method to find the sum of integers from 7 to 100
    public static int getSumFromSevenToHundred() {
        return IntStream.range(7, 101).//his intStream does the same actions for loop does in structured programming.
                reduce(0, Math::addExact);
        /*
         * the last number is exclusive
         we use intStream if there is no list  * */
    }

    public static int getSumFromSevenToHundred02() {
        return IntStream.rangeClosed(7, 100)//his intStream does the same actions for loop does in structured programming.
                .reduce(0, Math::addExact);

    }
    //create a method to find the multiplication of the integers from 2(inc) to 11(inc)

    public static int findMultiplication() {
        return IntStream.rangeClosed(2, 11).reduce
                (1, Math::multiplyExact);
    }
    //create a method to calculate the factorial of a given number
    //5 factorial ?1.2.3.4.5=5!
    public static Object factorial(int x) {
       return  x>0 ?  IntStream.rangeClosed(1,x).reduce(1,
               Math::multiplyExact):"Do not use negative numbers ";
    }

    //2.way
    //5 factorial ?1.2.3.4.5=5!
    /*Object data type covers string and integer*/
    public static Object factorial02(int x) {
        if (x>0){
        return IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact);
        }
        System.out.println("Do not use negative numbers in factorial operations");
    return 0;
    //try to make your code better you push your code to the manager.
        // search different sceneros for the cod

}
//Create a method to calculate the sum of even integers between given 2 integers.

    public static int sumOfIntegers(int s, int e){
      int x=0;
      if (s>e){
          x=s;
          s=e;
          e=x;

      }
    return IntStream.rangeClosed(s,e).filter(Utils::checkToBeEven).sum();
    }

    //Create a method to calculate the sum of digits of every integer between given two integers
    //23 and 32=2+3, 2+4, 2+5
    public static int findSumOfDigitsForTheIntegersInTheGivenRange(int s, int e){
        int x=0;
        if (s>e){
            x=s;
            s=e;
            e=x;

        }
        return IntStream.rangeClosed(s,e).map(Utils::getSumOfDigit).sum();

    }

}



