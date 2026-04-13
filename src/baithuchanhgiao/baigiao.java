package baithuchanhgiao;

import java.util.Scanner;
import java.util.TreeSet;

public class baigiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeSet<Integer> set1 = new TreeSet<>();
        for(int i = 0;i < n;i++){
            a[i] =  sc.nextInt();
            set1.add(a[i]);
        }
        for(int i = 0;i < m;i++){
            b[i] =  sc.nextInt();
        }
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i : b){
            if(set1.contains(i)) {
                set2.add(i);
            }
        }
        for(int i : set2){
            System.out.print(i + " ");
        }


    }
}
