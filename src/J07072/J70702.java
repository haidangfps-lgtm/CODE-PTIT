import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Danhsach implements Comparable<Danhsach> {
    String name, ten, ho, dem;

    public Danhsach(String name) {
        String a = "";
        String[] format = name.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }

        this.name = a.trim();
        String b = format[format.length - 1];
        this.ten = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();
        String c = format[0];
        this.ho = c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase();
        String d = "";
        for (int i = 1; i < format.length - 1; i++) {
            String j = format[i];
            d += j.substring(0, 1).toUpperCase() + j.substring(1).toLowerCase() + " ";
        }
        this.dem = d.trim();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Danhsach o) {
        if (!this.ten.equals(o.ten))
            return this.ten.compareTo(o.ten);
        if (!this.ho.equals(o.ho))
            return this.ho.compareTo(o.ho);
        return dem.compareTo(o.dem);
    }
}
public class J70702{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Danhsach> list= new ArrayList<Danhsach>();
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(new Danhsach(name));
        }
        Collections.sort(list);
        for(Danhsach d : list){
            System.out.println(d);
        }
    }
}

