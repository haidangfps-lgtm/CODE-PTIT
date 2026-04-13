package hocbongsinhvien;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class SinhVien {
    String ten;
    double tbc;
    int rl;
    String hocbong;

    public SinhVien(String ten, double tbc, int rl) {
        this.ten = ten;
        this.tbc = tbc;
        this.rl = rl;
        this.hocbong = "KHONG";
    }
}
public class hocbongsinhvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        SinhVien[] danhSachSV = new SinhVien[n];
        Double[] diemTbcHopLe = new Double[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            double tbc = sc.nextDouble();
            int rl = sc.nextInt();
            sc.nextLine();
            danhSachSV[i] = new SinhVien(ten, tbc, rl);

            if (tbc >= 3.6 && rl >= 90) danhSachSV[i].hocbong = "XUATSAC";
            else if (tbc >= 3.2 && rl >= 80) danhSachSV[i].hocbong = "GIOI";
            else if (tbc >= 2.5 && rl >= 70) danhSachSV[i].hocbong = "KHA";
            if (!danhSachSV[i].hocbong.equals("KHONG")) {
                diemTbcHopLe[count++] = tbc;
            }
        }

        double diemChuan = 5.0;

        if (count > 0) {
            Double[] danhSachDiemXet = Arrays.copyOf(diemTbcHopLe, count);
            Arrays.sort(danhSachDiemXet, Collections.reverseOrder());

            if (m >= count) {
                diemChuan = danhSachDiemXet[count - 1];
            } else {
                diemChuan = danhSachDiemXet[m - 1];
            }
        }

        for (SinhVien sv : danhSachSV) {
            if (!sv.hocbong.equals("KHONG") && sv.tbc >= diemChuan) {
                System.out.println(sv.ten + ": " + sv.hocbong);
            } else {
                System.out.println(sv.ten + ": KHONG");
            }
        }

        sc.close();
    }

}
