import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//package J07053;
class Xettuyen {
    private String maxt, ten, ngaysinh;
    double diemlt, diemth;
    private int tuoi;

    public Xettuyen(int id, String ten, String ngaysinh, double diemlt, double diemth) {
        this.maxt = String.format("PH%02d", id);

        String a = "";
        String[] format = ten.trim().split("\\s+");
        for (String s : format) {
            a += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();

        this.tuoi = 2021 - Integer.parseInt(ngaysinh.trim().substring(6));
        this.diemlt = diemlt;
        this.diemth = diemth;
    }

    public double getDiemthuong() {
        if (diemlt >= 8 && diemth >= 8)
            return 1.0;
        if (diemlt >= 7.5 && diemth >= 7.5)
            return 0.5;
        return 0.0;
    }

    public int getTongdiem() {
        double tong = (diemlt + diemth) / 2 + getDiemthuong();
        int ketqua = (int) Math.round(tong);
        return Math.min(ketqua, 10);
    }

    public String rank() {
        int kq = getTongdiem();
        if (kq < 5)
            return "Truot";
        if (kq < 7)
            return "Trung binh";
        if (kq == 7)
            return "Kha";
        if (kq == 8)
            return "Gioi";
       return "Xuat sac";
    }

    @Override
    public String toString() {
        return maxt + " " + ten + " " + tuoi + " " + getTongdiem()  +  " " + rank();
    }
}

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Xettuyen> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double diemlt = Double.parseDouble(sc.nextLine());
            double diemth = Double.parseDouble(sc.nextLine());
            list.add(new Xettuyen(i + 1, ten, ngaysinh, diemlt, diemth));
        }
        for(Xettuyen x : list) {
            System.out.println(x);
        }
    }

}
