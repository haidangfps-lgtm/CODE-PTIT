package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Tiendien implements Comparable<Tiendien> {
    String makh, ten;
    String loai;
    int chisodau, chisocuoi;
    long tientrongdinhmuc, tienngoaidinhmuc, vat;
    long tongtien;

    public Tiendien(int id, String ten, String loai, int chisodau, int chisocuoi) {
        this.makh = String.format("KH%02d", id);
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();

        this.loai = loai;
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;

        tinhtien();
    }

    public int getDinhmuc() {
        if (loai.equals("A"))
            return 100;
        if (loai.equals("B"))
            return 500;
        if (loai.equals("C"))
            return 200;
        return 0;
    }

    public void tinhtien() {
        int dinhmuc = getDinhmuc();
        int sodien = chisocuoi - chisodau;
        if (sodien < dinhmuc) {
            this.tientrongdinhmuc = sodien * 450;
        } else tientrongdinhmuc = dinhmuc * 450;
        if(sodien > dinhmuc){
            this.tienngoaidinhmuc = (sodien - dinhmuc) * 1000;
        }
        else
            this.tienngoaidinhmuc = 0;
        this.vat = (long) (this.tienngoaidinhmuc * 0.05);
        this.tongtien = tienngoaidinhmuc + tientrongdinhmuc + vat;
    }

    @Override
    public int compareTo(Tiendien o) {
        return Long.compare(o.tongtien, this.tongtien);
    }

    @Override
    public String toString() {
        return makh + " " + " " + ten + " " + tientrongdinhmuc + " " + tienngoaidinhmuc + " " + vat + " " + tongtien;
    }
}

public class J07056 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Tiendien> list = new ArrayList<Tiendien>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String loai = sc.next();
            int chisodau = sc.nextInt();
            int chisocuoi = sc.nextInt();
            list.add(new Tiendien(i + 1, ten, loai, chisodau, chisocuoi));
        }
        Collections.sort(list);
        for(Tiendien t : list){
            System.out.println(t);
        }
    }
}
