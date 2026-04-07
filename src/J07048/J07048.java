import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sanpham implements Comparable<Sanpham>{
   private String masp, ten;
   private int giaban, baohanh;

    public Sanpham(String masp, String ten, int giaban, int baohanh) {
        this.masp = masp;
        this.ten = ten;
        this.giaban = giaban;
        this.baohanh = baohanh;
    }

    @Override
    public int compareTo(Sanpham o) {
        if(this.giaban != o.giaban){
            return o.giaban - this.giaban;
        }
        return this.masp.compareTo(o.masp);
    }
    @Override
    public String toString() {
        return masp + " " + ten + " " + giaban + " " + baohanh;
    }
}


public class J07048 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sanpham> list = new ArrayList<>();
        while(t-->0){
            String masp = sc.nextLine();
            String ten = sc.nextLine();
            int giaban = Integer.parseInt(sc.nextLine());
            int baohanh = Integer.parseInt(sc.nextLine());
            list.add(new Sanpham(masp, ten, giaban, baohanh));
        }
        Collections.sort(list);
        for(Sanpham s: list){
            System.out.println(s);
        }
    }
}
