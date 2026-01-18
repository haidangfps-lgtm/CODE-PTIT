import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07021 {
   public static void main(String[] args) throws IOException, FileNotFoundException {
       Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            String[] array = s.trim().split("\\s+");
            String a = "";
            for(String i :  array){
                a += i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() + " ";
            }
            System.out.println(a);
         }

   }
}
