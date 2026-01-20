import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class J07032 {
    static boolean check(int n) {

        String s = Integer.toString(n);

        if (s.length() < 2 || (s.length() % 2 == 0)) return false;  // > 1 va chuoi~ la so le

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))   // kiem tra thuan nghich check dau cuoi
                return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0)     // check so le dung int
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {

        int[] d1 = new int[1000011];
        int[] d2 = new int[1000011];

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        for (int x : list1) {
            d1[x]++;
        }
        for (int x : list2) {
            d2[x]++;
        }
        int dem = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (d1[i] > 0 && d2[i] > 0) {
                if (check(i)) {
                    System.out.println(i + " " + (d1[i] + d2[i]));
                    dem++;
                    if (dem == 10) {
                        break;
                    }
                }

            }

        }

    }
}
