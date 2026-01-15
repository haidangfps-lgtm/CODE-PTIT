import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int [] dang = new int [1000];
        // create array to store
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            dang[n]++;
            // duyet tu dau array den cuoi array neu nextInt trung
            // thi gan gia tri do cho phan tu trong mang tu do biet duoc so lan xuat hien
        }
        for(int i = 0; i < 1000; i++){
            if(dang[i] > 0)
            System.out.println(i + " " + dang[i]);
        }
    }
}
