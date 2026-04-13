package J07085;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SINHVIEN.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        for (String s : list) {
            String a = "";

            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    a += s.charAt(i);
                }
            }
            int index = 0;
            for(int i = 0;i < a.length() - 1;i++){
                if(a.charAt(i) == '0'){
                    index++;
                }
                else break;
            }
            String number = a.substring(index);

            int sumnumber = 0;
            for(int i = 0 ;i < number.length();i++){
                sumnumber += (number.charAt(i) - '0');
            }
            System.out.println(number + " " + sumnumber);
        }

    }
}

