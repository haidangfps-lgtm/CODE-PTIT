
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    TreeSet<String> fileset;

    public WordSet(String namefile) throws FileNotFoundException {
        fileset = new TreeSet<>();
        Scanner sc = new Scanner(new File(namefile));
        while(sc.hasNext()){
            fileset.add(sc.next().toLowerCase());
        }
    }

    public String union(WordSet s2){
        TreeSet<String> unionset = new TreeSet<>();
        for(String s : this.fileset){
            unionset.add(s);
        }
        for(String s : s2.fileset){
            unionset.add(s);
        }
        String kq1 = "";
        for(String s : unionset){
            kq1 += s + " ";
        }
        return kq1;
    }

    public String intersection(WordSet s2){
        TreeSet<String> intersectionset = new TreeSet<>();
        for(String s : this.fileset){
            if(s2.fileset.contains(s)){
                intersectionset.add(s);
            }
        }
        String kq2 = "";
        for(String s : intersectionset){
            kq2 += s + " ";
        }
        return kq2;
    }
}

public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("SINHVIEN.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
