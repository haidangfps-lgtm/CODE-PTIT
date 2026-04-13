package J03034;

import java.util.Scanner;

public class J03034 {
    public static String charcheck(String s) {
        if (s.charAt(0) == '0')
            return "INVALID";
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return "INVALID";
            }
            int a = c - '0';
            if (a % 2 == 0) {
                left++;
            } else {
                right++;
            }
        }
        if (s.length() % 2 == 0 && left > right) {
            return "YES";
        }
        if (s.length() % 2 == 1 && left < right) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(charcheck(s));
        }
    }
}
