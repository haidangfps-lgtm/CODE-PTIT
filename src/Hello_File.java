import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.Scanner;

public class Hello_File {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}


