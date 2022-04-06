package day20practice_interview;

public class Practice05 {
    public static void main(String[] args) {
        String str = "M "; //M

        str = str.concat("E "); //M E

        String add = "S ";

        str = str.concat(add);//M E S

        str.replace("S", "T"); //M E S

        str = str.concat(add); //M E S S

        System.out.println(str);  //M E S S

    }
    }