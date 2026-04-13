
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.io.File;

class Online implements Comparable<Online>{
    String ten;
    String ngaybatdau, ngayketthuc;
    long timing;

    public Online(String ten, String ngaybatdau, String ngayketthuc) throws ParseException {
        this.ten = ten;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d1 = sdf.parse(ngaybatdau);
        Date d2 = sdf.parse(ngayketthuc);

        this.timing =(d2.getTime() - d1.getTime()) / 1000 / 60;
    }

    @Override
    public String toString(){
        return ten + " " + timing;
    }

    @Override
    public int compareTo(Online o){
        if(this.timing != o.timing){
           return Long.compare(o.timing, this.timing);
        }
        return this.ten.compareTo(o.ten);
    }
}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        ArrayList<Online> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ten = sc.nextLine();
            String ngaybatdau = sc.nextLine();
            String ngayketthuc = sc.nextLine();
            list.add(new Online(ten, ngaybatdau, ngayketthuc));
        }
        Collections.sort(list);
        for(Online o : list){
            System.out.println(o);
        }


    }
}
