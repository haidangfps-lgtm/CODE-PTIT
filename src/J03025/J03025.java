package J03025;

import java.util.Scanner;

public class J03025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int count = 0;
            String s = sc.nextLine();
            int n = s.length();
            for(int i = 0; i < n / 2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)){
                    count++;
                }
            }

            if(count == 1 || count == 0 && n % 2 == 1){
                System.out.println("YES");
            }
            else System.out.println("NO");



        }


    }
}
