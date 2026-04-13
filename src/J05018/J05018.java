package J05018;

import java.util.*;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien>{
    String masv, ten, xeploai;
    double diemtb;

    public Sinhvien(int id, String ten, double[] a) {
        this.masv = String.format("HS%02d", id);
        this.ten = ten;
        this.diemtb = getDiemtb(a);
        this.xeploai = getXeploai(diemtb);

    }
    public double getDiemtb(double[] a) {
        double sum = 0;
        for(int i = 0;i < 10;i++){
            if(i == 1 || i == 0){
                sum += a[i] * 2;
            }
            else {
                sum += a[i];
            }
        }
        return Math.round(sum / 12.0 * 10.0) / 10.0;
    }
    public String getXeploai(double diemtb){
        if (diemtb >= 9.0) return "XUAT SAC";
        if (diemtb >= 8.0) return "GIOI";
        if (diemtb >= 7.0) return "KHA";
        if (diemtb >= 5.0) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + String.format("%.1f", diemtb) + " " + xeploai;
    }
    @Override
    public int compareTo(Sinhvien o) {
        if (this.diemtb != o.diemtb) {
            return Double.compare(o.diemtb, this.diemtb);
        }
        return this.masv.compareTo(o.masv);
    }
}
public class J05018 {
    public static void main(String[] args) {
        ArrayList<Sinhvien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String ten = sc.nextLine();
            double[] a = new double[10];
            for(int j = 0;j < 10;j++){
                a[j] = sc.nextDouble();
            }
            sc.nextLine();
            list.add(new Sinhvien(i,ten,a));
        }
        Collections.sort(list);
        for (Sinhvien sv : list) {
            System.out.println(sv);
        }
    }

}
