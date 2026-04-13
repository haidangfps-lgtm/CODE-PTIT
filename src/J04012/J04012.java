package J04012;

import java.util.ArrayList;
import java.util.Scanner;

class Nhanvien{
    String manv, ten, chucvu;
    int luongcoban, songaycong;

    public Nhanvien(int id, String ten, int luongcoban, int songaycong, String chucvu) {
        this.manv = String.format("NV%02d", id);
        this.ten = ten;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
        this.chucvu = chucvu;
    }

    public int getLuongthang(){
        return luongcoban * songaycong;
    }

    public int getLuongthuong(){
        int luong = getLuongthang();
        if(songaycong >= 25){
            return  (int) (luong * 0.2);
        }
        else if(songaycong < 25 && songaycong >= 22){
            return (int) (luong * 0.1);
        }
        else{
            return 0;
        }
    }
    public int getPhucap(){
        if(chucvu.equals("GD")){
            return 250000;
        } else if (chucvu.equals("PGD")) {
            return 200000;
        }
        else if (chucvu.equals("TP")) {
            return 180000;
        }
        else if (chucvu.equals("NV")) {
            return 150000;
        }
        else{
            return 0;
        }
    }

    public int getThunhap(){
        return getPhucap() + getLuongthuong() + getLuongthang();
    }

    @Override
    public String toString() {
        return manv + " " +  ten + " " + getLuongthang() + " " + getLuongthuong() + " " + getPhucap() + " " + getThunhap();
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> list = new ArrayList<>();
        int id = 1;
        int t = 1;
        while (t -- > 0) {
            String ten = sc.nextLine();
            int luongcoban = Integer.parseInt(sc.nextLine());
            int songaycong = Integer.parseInt(sc.nextLine());
            String chucvu = sc.nextLine();
            list.add(new Nhanvien(id++, ten, luongcoban, songaycong, chucvu ));
        }
      for(Nhanvien s : list){
          System.out.println(s);
      }
    }
}
