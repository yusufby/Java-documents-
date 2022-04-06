package practice08;

public class Q04 {
    public static void main(String[] args) {
        /*
         * Ask user to enter 2 positive integer then find
         * GCD (The Greatest Common Divisor) and
         * (if user enter 30 and 40 GCD = 10 )
         */
        int int1 = 30;
        int int2 = 40;
        int gcd = 1;
        int lcm = 1;
        for (int i = 1; i < int1; i++) {
            if (int1 % i == 0 && int2 % i == 0) {
                gcd = i;
            }
        }
        for (int j = 1; j < int1; j++) {
            if (int1 % j == 0 || int2 % j == 0) {
                lcm = lcm * j;
                if (lcm > int1 && lcm > int2) {
                    break;
                }
            }
        }
        System.out.println("lcm : " + lcm);
        System.out.println("gcd : " + gcd);
    }
    }

