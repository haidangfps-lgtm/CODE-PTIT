package J06009; // <--- THÊM DÒNG NÀY Ở DÒNG SỐ 1
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Khachhang {
    String makh, tenkh, sex, ngaysinh, diachi;

    public Khachhang(int id, String tenkh, String sex, String ngaysinh, String diachi) {
        this.makh = String.format("KH%03d", id);
        this.tenkh = tenkh;
        this.sex = sex;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
}

class Mathang {
    String mamh, tenmh, donvitinh;
    int giamua, giaban;

    public Mathang(int id, String tenmh, String donvitinh, int giamua, int giaban) {
        this.mamh = String.format("MH%03d", id);
        this.tenmh = tenmh;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }
}

class Hoadon {
    String mahd;
    Khachhang kh;
    Mathang mh;
    int soluong;

    public Hoadon(int id, Khachhang kh, Mathang mh, int soluong) {
        this.mahd = String.format("HD%03d", id);
        this.kh = kh;
        this.mh = mh;
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        long thanhtien = (long) mh.giaban * soluong;
        return mahd + " " + kh.tenkh + " " + kh.diachi + " " + mh.tenmh + " " + mh.donvitinh + " " + mh.giamua + " " + mh.giaban + " " + soluong + " " + thanhtien;
    }
}


public class J06009 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        Scanner sc1 = new Scanner(new File("SV.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        ArrayList<Khachhang> list_khachhang = new ArrayList<>();
        ArrayList<Mathang> list_mathang = new ArrayList<>();
        ArrayList<Hoadon> list_hoadon = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String tenkh = sc.nextLine();
            String sex = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            list_khachhang.add(new Khachhang(i + 1, tenkh, sex, ngaysinh, diachi));
        }
        int a = Integer.parseInt(sc1.nextLine());
        for (int j = 0; j < a; j++) {
            String tenmh = sc1.nextLine();
            String donvitinh = sc1.nextLine();
            int giamua = Integer.parseInt(sc1.nextLine());
            int giaban = Integer.parseInt(sc1.nextLine());
            list_mathang.add(new Mathang(j + 1, tenmh, donvitinh, giamua, giaban));
        }
        int b = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < b; i++) {
            String makh = sc2.next();
            String mamh = sc2.next();
            int soluong = Integer.parseInt(sc2.next());

            int index1 = Integer.parseInt(makh.substring(2)) - 1;
            int index2 = Integer.parseInt(mamh.substring(2)) - 1;

            Khachhang kh = list_khachhang.get(index1);
            Mathang mh = list_mathang.get(index2);

            list_hoadon.add(new Hoadon(i, kh, mh, soluong));
            }
        for (Hoadon x : list_hoadon) {
            System.out.println(x);
        }
    }
}
