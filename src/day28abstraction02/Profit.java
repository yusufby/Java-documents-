package day28abstraction02;

public class Profit extends Calculator {


    @Override
    public int addition(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int multiplication(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int subtraction(int n1, int n2) {
        return -1;
    }

    @Override
    public int division(int n1, int n2) {
        return -1;
    }
}
