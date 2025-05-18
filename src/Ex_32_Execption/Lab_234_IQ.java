package Ex_32_Execption;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_234_IQ {
    public static void main(String[] args) {
        System.out.println("Starting ");
        try {
            FileReader fileReader= new FileReader(new File("C://abc.txt"));
        }catch (FileNotFoundException E){
            System.out.println(E.getMessage());
        }
        System.out.println("End");
    }
}
