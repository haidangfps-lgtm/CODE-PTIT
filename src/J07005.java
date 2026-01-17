import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        //doc file nhi phan thay vi dung scanner ta dung datainputstream
        int[] dang = new int[1000];
        for (int i = 0; i < 100000; i++) {
            dang[sc.readInt()]++;
           // sc.readInt() la doc so lan xuat hien
        }
        for (int i = 0; i < 1000; i++) {
            if (dang[i] > 0) {
                System.out.println(i + " " +  dang[i]);
            }
        }
    }
}
