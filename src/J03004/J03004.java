package J03004;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

class Sinhvien{
    String ten;

    public Sinhvien(String ten) {
        String a = "";
        String[] format = ten.trim().split("\\s+");
        for(String s : format){
            a += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
    }
    @Override public String toString(){
        return ten;
    }
}
public class J03004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ten = sc.nextLine();
            list.add(new Sinhvien(ten));
        }
        for(Sinhvien s : list){
            System.out.println(s);
        }
    }
}
