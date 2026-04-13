package J05024;

import java.util.ArrayList;
import java.util.Scanner;

class Sinhvien{
    String masv,ten, lop, email;

    public Sinhvien(String masv, String ten, String lop, String email) {
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return masv.substring(5,7);
    }


    @Override
    public String toString() {
        return masv + " " + ten + " " + lop  + " " + email;
    }
}
public class J05024 {
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
            String nganh = sc.nextLine();
            String manganh = "";
            if (nganh.equalsIgnoreCase("Ke toan")) {
                manganh = "KT";
            } else if (nganh.equalsIgnoreCase("Cong nghe thong tin")) {
                manganh = "CN";
            } else if (nganh.equalsIgnoreCase("An toan thong tin")) {
                manganh = "AT";
            } else if (nganh.equalsIgnoreCase("Vien thong")) {
                manganh = "VT";
            } else if (nganh.equalsIgnoreCase("Dien tu")) {
                manganh = "DT";
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for (Sinhvien s : list) {
                if (s.getLop().equals(manganh)) {
                    if ((manganh.equals("CN") || manganh.equals("AT")) && s.lop.startsWith("E")) {
                        continue;
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
