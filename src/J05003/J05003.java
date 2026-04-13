package J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Sinhvien{
    String masv,ten, lop,ngaysinh;
    double gpa;


    public Sinhvien(int id, String ten, String lop, String ngaysinh, double gpa) throws ParseException{
        this.masv = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = spf.format(spf.parse(ngaysinh));
        this.gpa = gpa;
    }
   /* public String format(String ngay){
        StringBuilder sb = new StringBuilder(ngay.trim());
        if(sb.charAt(1) == '/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4) == '/'){
            sb.insert(3,"0");
        }
        return sb.toString();
    }

    */

    @Override public String toString(){
        return masv + " " +  ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gpa);
    }

}
public class J05003 {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=n; i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            System.out.println(new Sinhvien(i,ten, lop,ngaysinh,gpa));
        }
    }
}
