import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Thoigian implements Comparable<Thoigian> {
    int gio;
    int phut;
    int giay;

    public Thoigian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }

    @Override
    public int compareTo(Thoigian o) {
        if (this.gio != o.gio)
            return this.gio - o.gio;
        if (this.phut != o.phut)
            return this.phut - o.phut;
        return this.giay - o.giay;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Thoigian> list = new ArrayList<>();
        while (t-- > 0) {
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            list.add(new Thoigian(gio, phut, giay));

        }
        Collections.sort(list);
        for (Thoigian x : list) {
            System.out.println(x);
        }
    }
}
