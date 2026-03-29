import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    String masv,name,lop, email;

    public SinhVien(String masv, String name, String lop, String email) {
        this.masv = masv;


        String[] a = name.trim().split("\\s+");
        String b = "";
        for(String i : a){
            b = b + i.substring(0,1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }

        this.name = b;

        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.masv.compareTo(o.masv);
    }

    @Override
    public String toString() {
        return masv + " " + name + " " + lop + " " + email;
    }
}
public class J07033 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
    int t = Integer.parseInt(sc.nextLine());
    ArrayList<SinhVien> list = new ArrayList<>();
    while (t-- > 0) {
        String masv = sc.nextLine();
        String name = sc.nextLine();
        String lop = sc.nextLine();
        String email = sc.nextLine();
        list.add(new SinhVien(masv, name, lop, email));
    }
    Collections.sort(list);
    for (SinhVien s : list) {
        System.out.println(s);
    }
    }
}
