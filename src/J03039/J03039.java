package J03039;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger n = sc.nextBigInteger();
            BigInteger m  = sc.nextBigInteger();
            int check = 0;

            if(n.remainder(m).equals(BigInteger.ZERO) || m.remainder(n).equals(BigInteger.ZERO)){
                check = 1;
            }
            if(check == 0 ){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
