package J03008;

import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0)
        {
            String s = sc.nextLine();
            int n = s.length();
            int check = 1;
            for(int i = 0; i < n/2; i++){
                char left = s.charAt(i);
                char right = s.charAt(n-i-1);
                if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                   check = 0;
                   break;
                }
                if(left != right){
                    check = 0;
                    break;
                }
            }
           if(check == 1){
                System.out.println("YES");
            }

            else System.out.println("NO");


        }
    }
}
