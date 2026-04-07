package J03033;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String n = sc.nextLine();
            String m = sc.nextLine();
            BigInteger a = new BigInteger(n);
            BigInteger b  = new BigInteger(m);
            BigInteger x = a.multiply(b);
            BigInteger y = a.gcd(b);
            System.out.println(x.divide(y));
        }
    }
}
