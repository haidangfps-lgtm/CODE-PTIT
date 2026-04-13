import  java.io.*;
import java.util.Scanner;

public class Hello_File {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine() );
        }
    }
}