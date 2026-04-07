package J05009;

import java.util.ArrayList;
import java.util.Scanner;

class Sinhvien{
    String stt,ten, ngaysinh;
    double diem1, diem2, diem3, tongdiem;

    public Sinhvien(int id,String ten, String ngaysinh, double tongdiem) {
        this.stt = String.format("%01d", id);
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongdiem = tongdiem;
    }
    @Override
    public String toString() {
        return stt + " " +  ten + " " + ngaysinh + " " +  tongdiem;
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Sinhvien> list = new ArrayList<>();
        double check = -1;
        for(int i = 1;i <= t;i++){
            String ten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());

            double tongdiem = diem1 + diem2 + diem3;
            list.add(new Sinhvien(i, ten, ngaysinh, tongdiem));
            if (tongdiem > check) {
                check = tongdiem;
            }
        }
        for(Sinhvien s : list){
            if(Double.compare(s.tongdiem,  check) == 0){
                System.out.println(s);
            }
        }
    }
}
