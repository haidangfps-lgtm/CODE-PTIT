
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Doanhnghiep implements Comparable<Doanhnghiep>{
    private String ma, ten;
    private int sosinhvien;

    public Doanhnghiep(String ma, String ten, int sosinhvien) {
        this.ma = ma;
        this.ten = ten;
        this.sosinhvien = sosinhvien;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + sosinhvien;
    }
    @Override
    public int compareTo(Doanhnghiep o) {
        return this.ma.compareTo(o.ma);
    }

}

public class J07037 {
    public static void main(String[] args) throws IOException , FileNotFoundException {
        Scanner sc = new Scanner(new File("PHONG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Doanhnghiep> list = new ArrayList<>();
        while(t-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int soluong = Integer.parseInt(sc.nextLine());
        list.add(new Doanhnghiep(id,name,soluong));
        }
        Collections.sort(list);
        for(Doanhnghiep i : list){
            System.out.println(i);
        }

    }

}
