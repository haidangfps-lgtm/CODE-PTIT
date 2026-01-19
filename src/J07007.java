import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> list = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            list.add(s.toLowerCase());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}

