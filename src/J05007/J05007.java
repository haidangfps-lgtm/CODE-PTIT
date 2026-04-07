package J05006;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Nhanvien1 implements Comparable<Nhanvien1>{
    String manv, ten, gioitinh, ngay, diachi, masothue, ngaykihopdong;

    public Nhanvien1(int id, String ten, String gioitinh, String ngay, String diachi, String masothue, String ngaykihopdong) {
        this.manv = String.format("%05d", id);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngay = ngay;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihopdong = ngaykihopdong;
    }

    @Override
    public int compareTo(Nhanvien1 o) {
      try {
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
          Date day1 = sdf.parse(this.ngay);
          Date day2 = sdf.parse(o.ngay);
          return day1.compareTo(day2);
      }
       catch (Exception e) {
          return 0;
       }
    }

    @Override
    public String toString() {
        return manv + " " + ten + " " + gioitinh + " " + ngay + " " + diachi + " " + masothue + " " + ngaykihopdong;
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien1> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngay = sc.nextLine();
            String diachi = sc.nextLine();
            String masothue = sc.nextLine();
            String ngaykihopd = sc.nextLine();
            list.add(new Nhanvien1(i, ten, gioitinh, ngay, diachi, masothue, ngaykihopd));
        }
        Collections.sort(list);
        for (Nhanvien1 nhanvien : list) {
            System.out.println(nhanvien);
        }
    }
}
