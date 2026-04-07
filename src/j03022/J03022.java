package j03022;

import java.util.HashSet;
import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            HashSet<Character> list = new HashSet<>();
            String s = sc.next();
            int k = sc.nextInt();
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }
            int count = list.size();
            if (26 - count <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}