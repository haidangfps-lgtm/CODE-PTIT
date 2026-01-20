import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {
    public static class dsmonhoc implements Comparable<dsmonhoc> {     // sap xep thi phai implements comparable roi viet them 1 override
        public String id;
        public String name;
        public Integer tinchi;

        public dsmonhoc(String id, String name, Integer tinchi) {
            this.id = id;
            this.name = name;
            this.tinchi = tinchi;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + tinchi;
        }

        @Override
        public int compareTo(dsmonhoc o) {
            return this.name.compareTo(o.name);    //neu muon sap xep theo ten mon hoc
        }
    }


    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<dsmonhoc> dsmonhocs = new ArrayList<dsmonhoc>();
        while (sc.hasNextLine()) {
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                int tinchi = Integer.parseInt(sc.nextLine());
                dsmonhocs.add(new dsmonhoc(id, name, tinchi));
            }
            Collections.sort(dsmonhocs);
            for (dsmonhoc x : dsmonhocs) {
                System.out.println(x);
            }

        }
    }
}
