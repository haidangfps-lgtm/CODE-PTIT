import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//package J07052;
class Thisinh123 implements Comparable<Thisinh123> {
    String mats;
    String name;
    double toan, ly, anh;
    double tongdiem;
    double diemuutien;
    String trangthai;

    public Thisinh123(String mats, String name, double toan, double ly, double anh) {
        this.mats = mats;

        String a = "";
        String[] format = name.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }

        this.name = a.trim();
        this.toan = toan;
        this.ly = ly;
        this.anh = anh;
        switch (mats.substring(0, 3)) {
            case "KV1":
                this.diemuutien = 0.5;
                break;
            case "KV2":
                this.diemuutien = 1.0;
                break;
            case "KV3":
                this.diemuutien = 2.5;
                break;
        }
        this.tongdiem = toan * 2 + ly + anh + this.diemuutien;
        this.trangthai = "";
    }

    public String formatSo(double n) {
        if (n == (int) n) {
            return String.format("%.0f", n);
        } else
            return String.format("%.1f", n);
    }

    public double getTongdiem() {
        return tongdiem;
    }

    public void getTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return mats + " " + name + " " + formatSo(diemuutien) + " " + formatSo(tongdiem) + " " + trangthai;
    }

    @Override
    public int compareTo(Thisinh123 o) {
        if (this.tongdiem != o.tongdiem) {
            return Double.compare(o.tongdiem, this.tongdiem);
        }
        return this.mats.compareTo(o.mats);
    }
}


public class J07052 {
    public static void main(String[] args) throws IOException, NoClassDefFoundError {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Thisinh123> list = new ArrayList<>();
        while (t-- > 0) {
            String mats = sc.nextLine();
            String name = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double anh = Double.parseDouble(sc.nextLine());
            list.add(new Thisinh123(mats, name, toan, ly, anh));
        }
        int chitieu = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        double diemchuan;
        if (chitieu > list.size()) {
            diemchuan = list.get(list.size() - 1).getTongdiem();
        } else {
            diemchuan = list.get(chitieu - 1).getTongdiem();
        }
        System.out.printf("%.1f\n", diemchuan);
        for (Thisinh123 o : list) {
            if (o.getTongdiem() >= diemchuan) {
                o.getTrangthai("TRUNG TUYEN");
            } else
                o.getTrangthai("TRUOT");
            System.out.println(o);
        }
    }
}
