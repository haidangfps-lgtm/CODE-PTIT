package J04013;


import java.util.ArrayList;
import java.util.Scanner;

class Sinhvien {
    String masv, ten;
    double diemtoan, diemly, diemhoa;
    double diemtong;
    double diemkv;
    String trangthai;


    public Sinhvien(String masv, String ten, double diemtoan, double diemly, double diemhoa) {
        this.masv = masv;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        this.diemtong = diemtoan * 2 + diemhoa + diemly;
        this.diemkv = diemkv;
        this.trangthai = trangthai;
    }

    public double getDiemkv() {
        String cut = this.masv.substring(0, 3);
        if (cut.equals("KV1")) {
           return 0.5;
        }
        if (cut.equals("KV2")) {
            return 1;
        }
        if (cut.equals("KV3")) {
            return 2.5;
        }
        return 0;
    }
    public String format(double score){
        String s = String.valueOf(score);
        if(s.endsWith(".0")){
            return s.replace(".0", "");
        }
        return s;
    }

    public String getTrangthai() {
        double tongdiemdacong = diemtong + getDiemkv();
        if (tongdiemdacong >= 24) {
            return "TRUNG TUYEN";
        } else return "TRUOT";
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + format(getDiemkv()) + " " + format(diemtong) + " " + getTrangthai();
    }
}

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> list = new ArrayList<>();
        String masv = sc.nextLine();
        String ten = sc.nextLine();
        double diemtoan = sc.nextDouble();
        double diemly = sc.nextDouble();
        double diemhoa = sc.nextDouble();

        list.add(new Sinhvien(masv, ten, diemtoan, diemly, diemhoa));
        for(Sinhvien sv : list){
            System.out.println(sv);
        }
    }

}
