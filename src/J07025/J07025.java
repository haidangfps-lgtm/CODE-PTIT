package J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class Khachhang implements Comparable<Khachhang> {
    String makh, ten, gioitinh, diachi, ngaysinh;
    LocalDate ns;
    public Khachhang(int id , String ten, String gioitinh, String diachi, String ngaysinh) {
        this.makh = String.format("KH%03d", id);
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for(String s : format){
            a += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
        this.gioitinh = gioitinh.trim();

        this.diachi = diachi.trim();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.ns = LocalDate.parse(ngaysinh,dtf);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngaysinh = this.ns.format(dtf1);
    }
    @Override public int compareTo(Khachhang o){
       return this.ns.compareTo(o.ns);
    }


    @Override
    public String toString() {
        return makh + " " + ten +" " + gioitinh + " " + diachi + " " + ngaysinh;
    }
}
public class J07025 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khachhang> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();

            list.add(new Khachhang(i + 1, ten, gioitinh, diachi, ngaysinh));
        }
        Collections.sort(list);
        for(Khachhang i : list){
            System.out.println(i);
        }
    }
}
