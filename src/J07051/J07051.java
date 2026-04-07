import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Khachsan implements Comparable<Khachsan> {
    private String makh;
    private String tenkh;
    private String sophong;
    LocalDate checkin;
    LocalDate checkout;
    private int dichvuphatsinh;
    private long day;
    private long tongtien;

    public Khachsan(int id, String tenkh, String sophong, String checkin, String checkout, int dichvuphatsinh) {

        this.makh = String.format("KH%02d", id);
        String a = "";
        String[] solve = tenkh.trim().split("\\s+");
        for (String i : solve) {
            a = a + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.tenkh = a;
        this.sophong = sophong;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.checkin = LocalDate.parse(checkin, dtf);
        this.checkout = LocalDate.parse(checkout, dtf);
        this.day = ChronoUnit.DAYS.between(this.checkin, this.checkout) + 1;
        this.dichvuphatsinh = dichvuphatsinh;
        this.tongtien = tinhtien();
    }

    private long tinhtien() {
        long dongia = 0;
        switch (sophong.substring(0, 1)) {
            case "1":
                dongia = 25;
                break;
            case "2":
                dongia = 34;
                break;
            case "3":
                dongia = 50;
                break;
            case "4":
                dongia = 80;
                break;
        }
        return dongia * day + dichvuphatsinh;
    }
    @Override
    public String toString() {
        return makh + " " + tenkh + " " + sophong + " " + day + " " + tongtien;
    }

    @Override
    public int compareTo(Khachsan o) {
        return Long.compare(o.tongtien, this.tongtien);
    }
}




public class J07051 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        ArrayList<Khachsan> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String tenkh = sc.nextLine();
            String sophong = sc.nextLine();
            String checkin = sc.nextLine();
            String checkout = sc.nextLine();
            int dichvuphatsinh = Integer.parseInt(sc.nextLine());
            list.add(new Khachsan(i + 1, tenkh, sophong, checkin, checkout, dichvuphatsinh));
        }
        Collections.sort(list);
        for (Khachsan khachsan : list) {
            System.out.println(khachsan);
        }
    }
}
