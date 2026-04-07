package J05011;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Titan implements Comparable<Titan> {
    String masv, ten;
    String giovao, giora;
    int duration;

    public Titan(String masv, String ten, String giovao, String giora) {
        this.masv = masv;
        this.ten = ten;
        LocalTime giovaoformat = LocalTime.parse(giovao);
        LocalTime gioraformat = LocalTime.parse(giora);
        this.giovao = giovao;
        this.giora = giora;
        this.duration = (int) Duration.between(giovaoformat, gioraformat).toMinutes();

    }
    @Override public int compareTo(Titan o) {
        return Integer.compare(o.duration, this.duration);
    }
    @Override
    public String toString() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return masv + " " + ten + " " + hours + " " +  "gio" + " "+  minutes + " " + "phut" ;
    }

}
public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Titan> list = new ArrayList<>();
        while (t-- > 0) {
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String giovao = sc.nextLine();
            String giora = sc.nextLine();
            list.add(new Titan(masv, ten, giovao, giora));
        }
        Collections.sort(list);
        for(Titan s : list){
            System.out.println(s);
        }

    }
}
