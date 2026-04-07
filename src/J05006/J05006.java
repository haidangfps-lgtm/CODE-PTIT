package J05006;

import java.util.ArrayList;
import java.util.Scanner;

class Nhanvien{
    String manv, ten, gioitinh, ngay, diachi, masothue, ngaykihopdong;

    public Nhanvien(int id, String ten, String gioitinh, String ngay, String diachi, String masothue, String ngaykihopdong) {
        this.manv = String.format("%05d", id);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngay = ngay;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihopdong = ngaykihopdong;
    }

    @Override
    public String toString() {
        return manv + " " + ten + " " + gioitinh + " " + ngay + " " + diachi + " " + masothue + " " + ngaykihopdong;
    }
}
public class J05006 {
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
        for (Nhanvien1 nhanvien : list) {
            System.out.println(nhanvien);
        }
    }
}
