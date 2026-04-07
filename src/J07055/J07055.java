package J07055;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien>{
    private String masv, ten;
    private double diemlt, diemth, diemthi;
    private double diemtrungbinh;
    private String ranked;


    public Sinhvien(int id, String ten, double diemlt, double diemth, double diemthi) {
        this.masv = String.format("SV%02d", id);
        String a ="";
        String[] format = ten.trim().split("\\s+");
        for(String s : format){
            a += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();

        this.diemlt = diemlt;
        this.diemth = diemth;
        this.diemthi = diemthi;
        this.diemtrungbinh = diemlt * 0.25 + diemth * 0.35 + diemthi * 0.40;
    }

    public String getRanked() {
        double diem = diemtrungbinh;
        if(diem > 8){
           return "GIOI";
        }
        if(diem > 6.5){
            return "KHA";
        }
        if(diem > 5){
            return "TRUNG BINH";
        }
        else return "KEM";
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + String.format("%.2f", diemtrungbinh) + " " + getRanked();
    }
    @Override
    public int compareTo(Sinhvien o) {
        return Double.compare(o.diemtrungbinh, this.diemtrungbinh);
    }

}
public class J07055 {
public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("Khachhang.in"));
    int t = Integer.parseInt(sc.nextLine());
    ArrayList<Sinhvien> list = new ArrayList<>();
    for(int i = 0; i < t; i++){
        String ten = sc.nextLine();
        double diemlt = Double.parseDouble(sc.nextLine());
        double diemth = Double.parseDouble(sc.nextLine());
        double diemthi = Double.parseDouble(sc.nextLine());
        list.add(new Sinhvien(i + 1,ten,diemlt,diemth,diemthi));
    }
    Collections.sort(list);
    for(Sinhvien s: list){
        System.out.println(s);
    }
}

}
