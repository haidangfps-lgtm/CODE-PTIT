package J020014;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int tong = 0;
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                tong += a[i];
            }
            int left = 0;
            int position = -1;
            for(int i = 0;i < n;i++){
                tong = tong - a[i];
                if(tong == left){
                    position = i + 1;
                    break;
                }
                left = left + a[i];
            }
            System.out.println(position);
        }
    }
}
