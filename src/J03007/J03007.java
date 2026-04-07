package J03007;

import java.util.Scanner;

public class J03007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int check = 1;
            int n = s.length();

            for(int i = 0;i < n;i++){
                char left = s.charAt(i);
                char right = s.charAt(n - i - 1);
                if(left != right){
                    check = 0;
                    break;
                }
                if(left - '0' < 2){
                    check = 0;
                    break;
                }
                for(int j = 2;j < n;j++){
                    if((left - '0') % j == 0){
                        check = 0;
                        break;
                    }
                }
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
