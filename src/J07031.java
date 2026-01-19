import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07031 {
    public static int n = 1000000;

    public static boolean snt(Integer n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(("SV.in")));

        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
// Dùng TreeSet để tự động SẮP XẾP TĂNG DẦN và LOẠI BỎ SỐ TRÙNG
        Set<Integer> snt1 = new TreeSet<>();
       Set<Integer> snt2 = new TreeSet<>();
        for (Integer i : list1) {
            if (snt(i)) {
                snt1.add(i);
            }
        }
      for(Integer i : list2) {
          if(snt(i)) {
              snt2.add(i);
          }
      }
        for(Integer i : snt1) {
            if(i > n / 2){
                break;
            }
            int m = n - i;
            if(snt(m) && snt1.contains(m) && snt1.contains(i) && !snt2.contains(m) && !snt2.contains(i)){
                System.out.println(i + " " + m);
            }
        }
    }
}
