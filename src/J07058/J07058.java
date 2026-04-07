package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Tenmon implements Comparable<Tenmon> {
    String mamh, ten, hinhthuc;

    public Tenmon(String mamh, String ten, String hinhthuc) {
        this.mamh = mamh.trim();
        this.ten = ten.trim();
        this.hinhthuc = hinhthuc.trim();
    }

    @Override
    public String toString() {
        return mamh + " " + ten + " " + hinhthuc;
    }

    @Override
    public int compareTo(Tenmon o) {
        return this.mamh.compareTo(o.mamh);
    }
}
public class J07058 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Tenmon> list = new ArrayList<>();
        while (t-- > 0) {
            String mamh = sc.nextLine();
            String ten = sc.nextLine();
            String hinhthuc = sc.nextLine();
            list.add(new Tenmon(mamh, ten, hinhthuc));
        }
        Collections.sort(list);
        for(Tenmon tenmon : list) {
            System.out.println(tenmon);
        }
    }
}
