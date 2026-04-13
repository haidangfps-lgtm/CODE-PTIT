package hocbongsinhvien;
import java.util.*;

class KhachHang {
    String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

    public KhachHang(int id, String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = String.format("KH%03d", id);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
}

class MatHang {
    String maMH, tenMH, donVi;
    long giaMua, giaBan;
    public MatHang(int id, String tenMH, String donVi, long giaMua, long giaBan) {
        this.maMH = String.format("MH%03d", id);
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
}

class HoaDon implements Comparable<HoaDon> {
    String maHD;
    KhachHang khachHang;
    MatHang matHang;
    int soLuong;
    long thanhTien, loiNhuan;

    public HoaDon(int id, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = String.format("HD%03d", id);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
        this.thanhTien = this.matHang.giaBan * soLuong;
        this.loiNhuan = (this.matHang.giaBan - this.matHang.giaMua) * soLuong;
    }

    @Override
    public int compareTo(HoaDon other) {
        if (this.loiNhuan != other.loiNhuan) {
            return Long.compare(other.loiNhuan, this.loiNhuan);
        }
        return this.maHD.compareTo(other.maHD);
    }

    @Override
    public String toString() {
        return maHD + " " + khachHang.tenKH + " " + khachHang.diaChi + " "
                + matHang.tenMH + " " + soLuong + " " + thanhTien + " " + loiNhuan;
    }
}
public class quanlybanhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, KhachHang> mapKH = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine().trim();
            String gt = sc.nextLine().trim();
            String ns = sc.nextLine().trim();
            String dc = sc.nextLine().trim();
            KhachHang kh = new KhachHang(i, ten, gt, ns, dc);
            mapKH.put(kh.maKH, kh);
        }
        int m = Integer.parseInt(sc.nextLine().trim());
        Map<String, MatHang> mapMH = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            String ten = sc.nextLine().trim();
            String dv = sc.nextLine().trim();
            long giaMua = Long.parseLong(sc.nextLine().trim());
            long giaBan = Long.parseLong(sc.nextLine().trim());
            MatHang mh = new MatHang(i, ten, dv, giaMua, giaBan);
            mapMH.put(mh.maMH, mh);
        }
        int k = Integer.parseInt(sc.nextLine().trim());
        List<HoaDon> listHD = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            String maKH = line[0];
            String maMH = line[1];
            int soLuong = Integer.parseInt(line[2]);
            HoaDon hd = new HoaDon(i, mapKH.get(maKH), mapMH.get(maMH), soLuong);
            listHD.add(hd);
        }

        Collections.sort(listHD);
        for (HoaDon hd : listHD) {
            System.out.println(hd);
        }
        sc.close();
    }
}
