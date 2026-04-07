package J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                String s1 =sc.next();
                String s2 =sc.next();
                BigInteger a = new BigInteger(s1);
                BigInteger b = new BigInteger(s2);
                String result = a.subtract(b).abs().toString();
                int length = Math.max(s1.length(),s2.length());
                for(int i = 0 ;i < length; i++){
                    if(result.length() < length){
                        result = '0' + result;
                    }
                }
                System.out.println(result);
                }
            }

    }

