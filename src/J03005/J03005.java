
import java.util.ArrayList;
import java.util.Scanner;

class Sinhvien{
    String ten;
    String ho;

    public Sinhvien(String ten) {
        String a = "";
        String[] format = ten.trim().split("\\s+");

        String b = format[0];
        this.ho = b.toUpperCase();
        for(int i = 1; i < format.length;i++){
            String c = format[i];
            a += c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase() + " ";
        }
        this.ten = a.trim();
    }
    @Override public String toString(){
        return ten + "," + " " + ho;
    }
}
public class J03005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ten = sc.nextLine();
            list.add(new Sinhvien(ten));
        }
        for(Sinhvien s : list){
            System.out.println(s);
        }
    }
}
