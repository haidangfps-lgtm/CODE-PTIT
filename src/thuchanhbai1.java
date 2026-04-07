import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Sinhvien1 implements Comparable<Sinhvien1>{
    String masv, ten, lop, email, dn;
    int id;

    public Sinhvien1(int id, String masv, String ten, String lop, String email, String dn) {
        this.id = id;
        this.masv = masv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String getDoanhnghiep(){
        return dn;
    }
    @Override
    public int compareTo(Sinhvien1 o){
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return id + " " +  masv + " " + ten + " " + lop + " " + email + " " + dn;
    }
}


public class thuchanhbai1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien1> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1;i <= t;i++){
            String masv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            list.add(new Sinhvien1(i, masv,ten,lop,email,dn));
        }
        Collections.sort(list);
        int s = Integer.parseInt(sc.nextLine());
        while(s-- > 0){
            String doanhnghiep = sc.nextLine().trim();
            for(Sinhvien1 a : list){
                if(a.getDoanhnghiep().equals(doanhnghiep)){
                    System.out.println(a);
                }
            }
        }
    }
}
