package J07054;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Sinhvien1 implements Comparable<Sinhvien1>{
    private String masv, ten;
    private int s1, s2 ,s3;
    private double diemtrungbinh;

    public Sinhvien1(int id, String ten, int s1, int s2, int s3) {
        this.masv = String.format("SV%02d", id);
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.diemtrungbinh = ((s1 * 3) + (s2 * 3) + (s3 * 2)) / (8.0);
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    @Override
    public String toString() {
        return masv +  " " + ten + " " + String.format("%.2f", diemtrungbinh);
    }

    @Override
    public int compareTo(Sinhvien1 o) {
        return Double.compare(o.diemtrungbinh, this.diemtrungbinh);
    }
}
public class J07054 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien1> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            int s1 = Integer.parseInt(sc.nextLine());
            int s2 = Integer.parseInt(sc.nextLine());
            int s3 = Integer.parseInt(sc.nextLine());
            list.add(new Sinhvien1(i + 1,ten,s1,s2,s3));
        }
        Collections.sort(list);

        System.out.println(list.get(0) + " 1");
        int rank = 1;
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i).getDiemtrungbinh() != list.get(i - 1).getDiemtrungbinh()) {
                rank = i + 1;
            }
            System.out.println(list.get(i) + " " + rank);
        }
    }
}
