package J03010;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> list = new ArrayList<>();
        while(t-->0){
            String a = sc.nextLine().toLowerCase();
            String[] format = a.trim().split("\\s+");
            String c = format[format.length - 1];
            for(int i = 0;i < format.length - 1;i++){
                c += format[i].charAt(0);
            }
            list.add(c);
           int count = 0;
           for(String z : list) {
               if (z.contains(c)) {
                   count++;
               }
           }

               if(count == 1){
                   System.out.println(c +"@ptit.edu.vn");
               }
               else {
                   System.out.println(c + count + "@ptit.edu.vn");
               }

        }
    }
}
