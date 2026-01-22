import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SV36 {
    private String masv;
    private String ten;
    private String lop;
    private String dob;
    private float diem;
    private static int ID = 1;

    public SV36(String ten, String lop, String dob, float diem) throws ParseException {

        this.masv = String.format("B20DCCN%03d", ID++);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
        this.diem = diem;
    }

    @Override
    public String toString() {
        return masv + " " + ten + " " + lop + " " + dob + " " + String.format("%.2f", diem);
    }
}
// ko public khai bao masv o SV   String.format("B...%03d", roi truyen cai stactic++)
// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//String.format("B20DCCN%03d", id++);
//String.format("%.2f", diem);
public class J07010 {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        while (sc.hasNext()) {
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String ten =  sc.nextLine();
                String lop = sc.nextLine();
                String dob = sc.nextLine();
                float diem = Float.parseFloat(sc.nextLine());
                System.out.println(new SV36(ten, lop, dob, diem));
            }
        }
    }
           /* quet 1 cac ki tu trong file tao 1 bien t  parse cgi no int roifop quet hết next line
           rồi chaạy
            */

}
