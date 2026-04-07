import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//package J07050;
class Mathang implements Comparable<Mathang>{
    private String mamh, ten, nhom;
    private double giamua, giaban, loinhuan;

    public Mathang(int id, String ten, String nhom, double giamua, double giaban) {
        this.mamh = String.format("MH%02d",id);
        this.ten = ten;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    @Override
    public int compareTo(Mathang o) {
        return Double.compare(o.loinhuan, this.loinhuan);
    }
    @Override
    public String toString() {
        return mamh + " " + ten + " " + nhom + " " + String.format("%.2f", loinhuan);
    }
}
public class J07050 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Mathang> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double giamua = Double.parseDouble(sc.nextLine());
            double giaban = Double.parseDouble(sc.nextLine());
            list.add(new Mathang(i + 1,ten,nhom,giamua, giaban));
        }
        Collections.sort(list);
        for(Mathang m : list) {
            System.out.println(m);
        }
    }
}
