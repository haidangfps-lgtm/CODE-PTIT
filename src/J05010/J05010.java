package J05010;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Mathang implements Comparable<Mathang>{
    String stt, ten, nhomhang;
    double giamua, giaban;
    double tienlai;

    public Mathang(int id, String ten, String nhomhang, Double giamua, Double giaban) {
        this.stt = String.format("%01d", id);
        this.ten = ten;
        this.nhomhang = nhomhang;
        this.giamua = giamua;
        this.giaban = giaban;
        this.tienlai = this.giaban - this.giamua;

    }

    @Override
    public int compareTo(Mathang o) {
        return Double.compare(o.tienlai, this.tienlai);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return stt + " " +  ten + " " + nhomhang + " " + df.format(tienlai);
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mathang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1 ; i <= t ; i++){
            String ten = sc.nextLine();
            String nhomhang = sc.nextLine();
            Double giamua = Double.parseDouble(sc.nextLine());
            Double giaban = Double.parseDouble(sc.nextLine());
            Double tienlai = giaban - giamua;
            list.add(new Mathang(i, ten,nhomhang, giamua, giaban));
        }
        Collections.sort(list);
        for (Mathang m : list) {
            System.out.println(m);
        }
    }

}
