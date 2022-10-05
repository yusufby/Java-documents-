package day07stringmanipulations;

public class StringPractice2 {
    public static void main(String[] args) {

        String character="Hi everyone!";
        int result=character.indexOf("h");
        if (result==-1){
            System.out.println("salah");
        }else {
            System.out.println("ingga salah");

        }
        String yusuf="Hi everyone";
        String yusuf1=yusuf.concat("!@#$%^t").concat("123456");
        System.out.println(yusuf1);
         boolean harf=yusuf.endsWith("e");
        System.out.println(harf);

        boolean harf2=yusuf1.startsWith("H");
        System.out.println(harf2);

        boolean hard3=yusuf1.startsWith("c", 3);
        System.out.println(hard3);

        String noSpace=yusuf1.replaceAll(" ", "");
        System.out.println(noSpace);
        System.out.println("=======");
        String numberEraser=yusuf1.replaceAll("[0-9]", "*");
        System.out.println(numberEraser);
    }



}
