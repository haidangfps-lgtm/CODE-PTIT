package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Sinhvien{
    String masv, ten, lop, ngaysinh;
    double gpa;

    public Sinhvien(int id, String ten, String lop, String ngaysinh, double gpa) {
        this.masv = String.format("B20DCCN%03d", id);
        String a ="";
        String[] format = ten.trim().split("\\s+");
        for(String s : format){
            a +=  s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
        this.lop = lop;
        StringBuilder sb = new StringBuilder(ngaysinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaysinh = sb.toString();
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return masv +" "+  ten +" "+ lop + " " + ngaysinh + " " + String.format("%.2f", gpa);
    }
}
public class J07018 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        for(int i = 0;i < t;i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new Sinhvien(i + 1,ten,lop,ngaysinh,gpa));
        }
        for(Sinhvien s: list){
            System.out.println(s);
        }
    }
}
