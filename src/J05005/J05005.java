package J05005;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien>{
    String masv, ten, lop, ngay;
    double gpa;

    public Sinhvien(int id, String ten, String lop, String ngay, double gpa) throws Exception {
        this.masv = String.format("B20DCCN%03d", id);
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for(String i : format) {
            a += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngay = sdf.format(sdf.parse(ngay));
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return masv + " " +  ten + " " + lop + " " + ngay + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(Sinhvien o) {
        return Double.compare(this.gpa, o.gpa);
    }
}
public class J05005 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        for(int i = 1;i<=t;i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngay = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new Sinhvien(i, ten, lop, ngay, gpa ));
        }
        Collections.sort(list);
        for(Sinhvien s : list){
            System.out.println(s);
        }

    }
}
