import java.io.IOException;
import java.util.Scanner;

class nhanvien{
    private String id;
    private String name;
    private String sex;
    private String dob;
    private String diachi;
    private String masothue;
    private String ngaykyhd;

    public nhanvien(String name, String sex, String dob, String diachi, String masothue, String ngaykyhd) throws NumberFormatException{
        this.id = "00001";
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykyhd = ngaykyhd;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sex +  " " + dob + " " + diachi + " " + masothue + " " + ngaykyhd;
    }
}


public class J04007 {
    public static void main(String[] args) throws IOException,NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String diachi = sc.nextLine();
        String masothue = sc.nextLine();
        String ngaykyhd = sc.nextLine();
        System.out.println(new nhanvien(name, sex, dob, diachi, masothue, ngaykyhd));
    }
}
