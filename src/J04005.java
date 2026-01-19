import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class thisinh{
    private String name;
    private String dob;
    private float t1,t2,t3;
    private float tong;

    public thisinh(String name, String dob, float t1, float t2, float t3) {
        this.name = name;
        this.dob = dob;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.tong = t1 + t2 + t3;
    }
    @Override
    public String toString() {
        return name + " " + dob + " " + String.format("%.1f", tong);
    }
}
public class J04005 {
    public static void main(String args[]) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
           String name = sc.nextLine();
           String dob = sc.nextLine();
           float t1 = Float.parseFloat(sc.nextLine());
           float t2 = Float.parseFloat(sc.nextLine());
           float t3 = Float.parseFloat(sc.nextLine());
            System.out.println(new thisinh(name, dob, t1, t2, t3));

        }
    }

}
