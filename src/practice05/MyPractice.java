package practice05;



public class MyPractice {

    public void add(double... v){
        double sum=0;
        for (double w : v) {
            sum = sum + w ;
        }
        System.out.println("The sum is " + sum);
    }
    public void subtract(double a, double b) {
        System.out.println("The subtraction is " + (a-b));


    }

    public void multiplication(double... y){
        double num= 1;
        for (double w: y)
        { num = num *w;
        }
        System.out.println(num);
}

    public void division(double x, double z){
        if(z==0){
            System.out.println("enter a valid info");
        }else{
            double m= x/z;
            System.out.println("multiplication is " + m);
        }

    }

}



