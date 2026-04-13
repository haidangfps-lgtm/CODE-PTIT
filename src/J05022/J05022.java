package J05022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien{
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
}
public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        while (t-- > 0) {
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Sinhvien(masv, ten, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String tenlop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP" + " " +  tenlop +":");
            for(Sinhvien s : list){

                if(tenlop.equals(s.lop)){
                    System.out.println(s);
                }
            }
        }
    }
}
