package J07073;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class svptit implements Comparable<svptit>{
    String malop, tenlop, tinchi, hinhthucgiangday1, hinhthucgiangday2;

    public svptit(String malop, String tenlop, String tinchi, String hinhthucgiangday1, String hinhthucgiangday2) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.tinchi = tinchi;
        this.hinhthucgiangday1 = hinhthucgiangday1;
        this.hinhthucgiangday2 = hinhthucgiangday2;
    }
    @Override public String toString(){
        return malop + " " +  tenlop + " " + tinchi + " " + hinhthucgiangday1 + " " + hinhthucgiangday2;
    }
    @Override public int compareTo(svptit o){
        return this.malop.compareTo(o.malop);
    }

}
public class J07030 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Khachhang.in"));
        ArrayList<svptit> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String malop = sc.nextLine();
            String  tenlop = sc.nextLine();
            String  tinchi = sc.nextLine();
            String  hinhthucgiangday1 = sc.nextLine();
            String  hinhthucgiangday2 = sc.nextLine();
            if(hinhthucgiangday2.equals("Truc tuyen") ||  hinhthucgiangday2.contains(".ptit.edu.vn")){
                list.add(new svptit(malop, tenlop, tinchi, hinhthucgiangday1, hinhthucgiangday2));
            }
        }
        Collections.sort(list);
        for(svptit o : list){
            System.out.println(o);
        }
    }
}
