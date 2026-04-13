package J05023;

import java.util.ArrayList;
import java.util.Scanner;
class Sinhvien{
    String masv, ten, lop, email;

    public Sinhvien(String masv, String ten, String lop, String email) {
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop.substring(1,3);
    }

    @Override public String toString(){
        return masv + " " + ten + " " +  lop + " " + email;
    }
}
public class J05023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Sinhvien(masv, ten, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String nam = sc.nextLine();
            String catnam = nam.substring(2,4);
            System.out.println("DANH SACH SINH VIEN KHOA " + nam + ":");
            for(Sinhvien s : list){
                if(s.getLop().contains(catnam))
                    System.out.println(s);
                }
            }
        }
    }


