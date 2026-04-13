package baithuchanh2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien>{
    String masv, ten, lop, diem1, diem2,diem3;
    int id;

    public Sinhvien(int id, String masv, String ten, String lop, String diem1, String diem2, String diem3) {
        this.id = id;
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return masv + " "  + ten + " " + lop + " " +  diem1 + " " + diem2 + " " + diem3;
    }
    @Override
    public int compareTo(Sinhvien o) {
        return this.ten.compareTo(o.ten);
    }
}
public class baithuchanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String  masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String diem1 = sc.nextLine();
            String diem2 = sc.nextLine();
            String diem3 = sc.nextLine();
            list.add(new Sinhvien(i, masv, ten, lop, diem1, diem2, diem3));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }
    }
}
