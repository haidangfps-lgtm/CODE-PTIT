package J02004;

import java.util.Scanner;

public class J02004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int check = 0;
            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0;i < n;i++){
                if(a[i] != a[n - i - 1]){
                    check = 1;
                }
                else check = 0;
            }
            if(check == 1){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
