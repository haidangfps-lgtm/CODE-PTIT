import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// ko public khai bao masv o SV   String.format("B...%03d", roi truyen cai stactic++)
// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//String.format("B20DCCN%03d", id++);
//String.format("%.2f", diem);
class Sv{
    private String id;
    private String name;
    private String lop;
    private String dob;
    private float diem;

    public Sv (String name, String lop, String dob, float diem) throws ParseException {
        this.id = String.format("B20DCCN001");
        this.name = name;
        this.lop = lop;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
        this.diem = diem;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", diem);
    }
}
 public class J04006 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            Float diem = Float.parseFloat(sc.nextLine());
            System.out.println(new Sv(name, lop, dob, diem));

    }
}
     /* quet 1 cac ki tu trong file tao 1 bien t  parse cgi no int roifop quet hết next line
           rồi chaạy
            */
