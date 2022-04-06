package day23inheritence;

public class Practice {
    public static void main(String[] args) {
        int sum=0;

        do {
            int y=1;
            System.out.print(y++ + " ");
            sum= sum + y;
            y++;

        }while(sum <=10);
        System.out.println(sum);
    }
}
