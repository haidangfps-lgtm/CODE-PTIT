package J03006;

import java.util.Scanner;

public class J03006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int check = 0;
            int n = s.length();
            for(int i = 0;i < n;i++){
                char left = s.charAt(i);
                char right = s.charAt(n - i - 1);
                if(left != right || (left - '0') % 2 == 1 ){
                    check = 0;
                    break;
                }
                else check = 1; break;

            }
            if(check == 0){
                System.out.println("NO");
            }
            else  if(check == 1){
                System.out.println("YES");
            }
        }
    }
}
