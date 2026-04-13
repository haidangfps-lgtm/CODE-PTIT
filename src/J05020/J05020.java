package J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien implements Comparable<Sinhvien>{
    String masv, ten, lop, email;

    public Sinhvien(String masv, String ten, String lop, String email) {
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + lop + " " + email;
    }
    @Override
    public int compareTo(Sinhvien o) {
        if(this.lop.compareTo(o.lop) != 0){
            return this.lop.compareTo(o.lop);
        }
        return this.masv.compareTo(o.masv);
    }
}
public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien>list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Sinhvien(masv, ten, lop, email));
        }
        Collections.sort(list);
        for(Sinhvien s: list){
            System.out.println(s);
        }
    }
}
