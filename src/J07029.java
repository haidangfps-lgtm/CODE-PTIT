import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;

public class J07029 {
    public static boolean snt(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] count =  new int[1000001];
        for(int x : list){
            count[x]++;
        }
        int dem = 0;
        for(int i = 100000; i > 2;i--){
            if(count[i] > 0){
                if(snt(i)){
                    System.out.println(i + " " + count[i]);
                    dem++;
                    if (dem == 10){
                        break;
                    }
                }
            }
        }
    }
}
