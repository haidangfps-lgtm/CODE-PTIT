import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String>  list = (ArrayList<String>) ois.readObject();
        HashSet<String> filebinary = new HashSet<>();

        for(String i : list){
            String[] words = i.trim().toLowerCase().split("\\s+");
            for(String w : words){
                filebinary.add(w);
            }
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> filetext = new LinkedHashSet<>();
        while(sc.hasNext()){
            String word = sc.next().toLowerCase();
            if(filebinary.contains(word)){
                filetext.add(word);
            }
        }
        for(String i : filetext){
            System.out.println(i);
        }

    }

}