/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Monhoc implements Comparable<Monhoc> {
    String mact, ngaythi, giothi, phongthi;
    long timeformat;

    public Monhoc(int id, String ngaythi, String giothi, String phongthi) {
        this.mact = String.format("C%03d", id);

        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.phongthi = phongthi;

        String[] a = ngaythi.split("/");
        String[] b = giothi.split(":");
        this.timeformat = Long.parseLong(a[0] + a[1] + a[2] + b[0] + b[1]);

    }

    @Override
    public String toString() {
        return mact + " " + ngaythi + " " + giothi + " " + phongthi;
    }

    @Override
    public int compareTo(Monhoc o) {
        if (this.timeformat != o.timeformat) {

            return Long.compare(this.timeformat, o.timeformat);
        }
        return this.mact.compareTo(o.mact);
    }
}

public class J07059 {
    public static void main(String[] arg) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Monhoc> list = new ArrayList<>();
        for (int a = 0; a < t; a++) {
            String ngaythi = sc.nextLine();
            String giothi = sc.nextLine();
            String phongthi = sc.nextLine();
            list.add(new Monhoc(a + 1, ngaythi, giothi, phongthi));
        }
        Collections.sort(list);
        for (Monhoc m : list) {
            System.out.println(m);
        }


    }
}


 */