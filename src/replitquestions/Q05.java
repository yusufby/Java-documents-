package replitquestions;

public class Q05 {
    public static void main(String[] args) {
/*How to debug with IntelliJ. (With simple question: print even numbers on the console
from 1 to 40; calculate addition of odd numbers
from 1 to 40 except 5 and multiply of 5)
 (we will do together please make ready your intelliJs*/

        int sumOddNumber = 0;
        for (int i = 1; i <41 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }else {
                if (i%5!=0){
                    sumOddNumber +=i;
                }
            }
        }
        System.out.println("\n");
        System.out.println(sumOddNumber);
    }
}
