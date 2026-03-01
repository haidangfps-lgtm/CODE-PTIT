package J05081; // <--- THÊM DÒNG NÀY
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Mathang implements Comparable<Mathang> {
    String mamh, ten, donvitinh;
    int giamua, giaban;
    int loinhuan;

    public Mathang(int id, String ten, String donvitinh, int giamua, int giaban) {
        this.mamh = String.format("MH%03d", id);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = this.giaban - this.giamua;
    }

    @Override
    public int compareTo(Mathang o) {
        if (this.loinhuan != o.loinhuan) {
            return o.loinhuan - this.loinhuan;
        }
        return this.mamh.compareTo(o.mamh);
    }

    @Override
    public String toString() {
        return mamh + " " + ten + " " + donvitinh + " " + giamua + " " + giaban + " " + loinhuan;
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Mathang> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String donvitinh = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            list.add(new Mathang(i + 1, ten, donvitinh, giamua, giaban));
        }
        Collections.sort(list);
        for (Mathang m : list) {
            System.out.println(m);
        }
    }

}
