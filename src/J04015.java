import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

class giaovien {
    String ma;
    String ten;
    int bacluong;
    int luongcoban;
    int phucap;
    int tongthunhap;

    public giaovien(String ma, String ten, int luongcoban) {
        this.ma = ma;
        this.ten = ten;
        this.luongcoban = luongcoban;

        this.bacluong = Integer.parseInt(ma.substring(2));
        String chucvu = ma.substring(0, 2);
        if (chucvu.equals("HT")) {
            this.phucap = 2000000;
        } else if (chucvu.equals("HP")) {
            this.phucap = 900000;
        } else if (chucvu.equals("GV")) {
            this.phucap = 500000;
        }
        this.tongthunhap = this.bacluong * this.luongcoban + this.phucap;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + bacluong + " " + phucap + " " + tongthunhap;
    }
}

public class J04015 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int luong = sc.nextInt();
            System.out.println(new giaovien(ma, ten, luong));
        }
    }
}
