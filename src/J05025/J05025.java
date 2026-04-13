package J05025;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Giangvien implements Comparable<Giangvien>{
    String magv, ten, monhoc;

    public Giangvien(int id, String ten, String monhoc) {
        this.magv = String.format("GV%02d",id);
        this.ten = ten;
        String a = "";
        String[] format = monhoc.trim().split("\\s+");
        for(String i : format){
            a += i.charAt(0);
        }
        this.monhoc = a.toUpperCase().trim();
    }

    @Override
    public String toString() {
        return magv + " " + ten + " " + " " + monhoc;
    }

    @Override
    public int compareTo(Giangvien o) {
       String[] s1 = this.ten.split("\\s+");
       String name1 = s1[s1.length - 1];
       String[] s2 = o.ten.split("\\s+");
       String name2 = s2[s2.length - 1];
       if(!name1.equals(name2)){
           return name1.compareTo(name2);
       }
        return this.magv.compareTo(o.magv);
    }
}
public class J05025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Giangvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <=t;i++){
            String ten = sc.nextLine();
            String monhoc = sc.nextLine();
            list.add(new Giangvien(i, ten, monhoc));
        }
        Collections.sort(list);
        for (Giangvien s : list){
            System.out.println(s);
        }
    }
}
