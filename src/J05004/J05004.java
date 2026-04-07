package J05004;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Sinhvien{
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.lop = lop;
        this.ngay = sdf.format(sdf.parse(ngay));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + lop + " " + ngay + " " + String.format("%.2f", gpa);
    }
}
public class J05004 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        for(int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
    String ngay = sc.nextLine();
    double gpa = Double.parseDouble(sc.nextLine());
     list.add(new Sinhvien(i,ten,lop,ngay,gpa));
        }
        for(Sinhvien s : list){
            System.out.println(s);
        }
    }
}
