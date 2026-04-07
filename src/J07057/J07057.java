package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien> {
    private String masv, ten, dantoc, trangthai;
    private double khuvucuutien;
    private double diemthi;
    private double total;

    public Sinhvien(int id, String ten, double diemthi, String dantoc, double khuvucuutien) {
        this.masv = String.format("TS%02d", id);
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
        this.diemthi = diemthi;
        this.dantoc = dantoc.trim();
        this.khuvucuutien = khuvucuutien;
        this.total = diemthi + getDiemdantoc() + getDiemkhuvuc();
        if(total >= 20.5) {
            trangthai = "Do";
        }
        else {
            trangthai = "Truot";
        }
    }

    public double getDiemdantoc() {
        String a = dantoc;
        double diemuutiendantoc = 0;
        if (!a.equals("Kinh")) {
            return diemuutiendantoc = 1.5;
        }
        return diemuutiendantoc = 0;

    }

    public double getDiemkhuvuc() {
        double diemmuutienkhuvuc = 0;
        double b = khuvucuutien;
        if (b == 1) {
            return diemmuutienkhuvuc = 1.5;
        } else if (b == 2) {
            return diemmuutienkhuvuc = 1;
        }
        return diemmuutienkhuvuc = 0;
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + String.format("%.1f", total) + " "+  trangthai;
    }

    @Override
    public int compareTo(Sinhvien o) {
        if(this.total != o.total) {
            return Double.compare(o.total, this.total);
        }
        return this.masv.compareTo(o.masv);
    }
}

public class J07057 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        ArrayList<Sinhvien> list = new ArrayList<Sinhvien>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            double diemthi = Double.parseDouble(sc.nextLine());
            String dantoc = sc.nextLine();
            double khuvucuutien = Double.parseDouble(sc.nextLine());
            list.add(new Sinhvien(i + 1, ten,diemthi, dantoc, khuvucuutien));
        }
        Collections.sort(list);
        for(Sinhvien s: list) {
            System.out.println(s);
        }
    }
}
