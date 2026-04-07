package J03015;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        System.out.println(s1.subtract(s2));
        }
}
