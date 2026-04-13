package thuchanh1;

import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            if (a.equals(b)) {
                System.out.println("-1");
            } else {
                System.out.println(Math.max(a.length(), b.length()));
            }
        }

        sc.close();
    }
}
