
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Khach implements Comparable<Khach> {
    public String makh, name, maphong;
    public LocalDate checkin, checkout;
    public long day;

    public Khach(int id, String name, String maphong, String checkin, String checkout) {
        this.makh = String.format("KH%02d", id);
        this.name = name;
        this.maphong = maphong;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.checkin = LocalDate.parse(checkin, dtf);
        this.checkout = LocalDate.parse(checkout, dtf);
        this.day = ChronoUnit.DAYS.between(this.checkin, this.checkout);
    }

    @Override
    public String toString() {
        return makh + " " + name + " " + maphong + " " + day;
    }

    @Override
    public int compareTo(Khach o) {
        return Long.compare(o.day, this.day);
    }
}
public class J07046 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> list = new ArrayList<>();
        int i = 1 ;
        while (t-- > 0) {
            String name = sc.nextLine();
            String maphong = sc.nextLine();
            String checkin = sc.nextLine();
            String checkout = sc.nextLine();
            list.add(new Khach(i, name, maphong, checkin, checkout));
            i++;
        }
        Collections.sort(list);
        for (Khach k :  list) {
            System.out.println(k);
        }
    }
}
