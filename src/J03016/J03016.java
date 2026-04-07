package J03016;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger eleven = new BigInteger("11");
// BigInteger eleven = BigInteger.valueOf(11);
            int check = 0;
           if(a.remainder(eleven). equals(BigInteger.ZERO)){
               check = 1;
           }
            else check = 0;
            System.out.println(check);
        }
    }
}
