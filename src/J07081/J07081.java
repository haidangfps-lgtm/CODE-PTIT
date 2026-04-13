package J07081;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien> {
    String masv, name, sdt, email;
    String ho, dem, ten;

    public Sinhvien(String masv, String name, String sdt, String email) {
        this.masv = masv;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
        String[] format = name.trim().split("\\s+");
        String a = format[format.length - 1]; //ten
        String b = format[0]; // ho
        String c = "";
        for (int i = 1; i < format.length - 1; i++) {
            c += format[i];
        }
        this.ho = b.trim();
        this.dem = c.trim();
        this.ten = a.trim();
    }

    @Override
    public String toString() {
        return masv + " " + name + " " + sdt + " " + email;
    }

    @Override
    public int compareTo(Sinhvien o) {
        if (!this.ten.equals(o.ten)) {
            return this.ten.compareTo(o.ten);
        } else if (!this.ho.equals(o.ho)) {
            return this.ho.compareTo(o.ho);
        } else if (!this.dem.equals(o.dem)) {
            return this.dem.compareTo(o.dem);
        } else
            return this.masv.compareTo(o.masv);
    }

}

public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        ArrayList<Sinhvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String masv = sc.nextLine();
            String name = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Sinhvien(masv, name, sdt, email));
        }
        Collections.sort(list);
        for (Sinhvien s : list) {
            System.out.println(s);
        }
    }
}
