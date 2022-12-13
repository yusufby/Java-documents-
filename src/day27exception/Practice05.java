package day27exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practice05 {
    public static void main(String[] args) {
        readFile("myFile.txt");
    }

    public  static void readFile(String fileRead){
        //checked exception
        try {
            FileReader reader=new FileReader(fileRead);
        }catch (FileNotFoundException e){
            System.out.println("not found ");
        }

    }

}
