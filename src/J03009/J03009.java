package J03009;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String[] a = s1.trim().split("\\s+");
            TreeSet<String> set1 = new TreeSet<>();
            String s2 = sc.nextLine();
            String[] b = s2.trim().split("\\s+");
            TreeSet<String> set2 = new TreeSet<>();
            for (String x : a) {
                set1.add(x);
            }
            for (String y : b) {
                set2.add(y);
            }
            TreeSet<String> set3 = new TreeSet<>();
            for (String z : set1) {
                if (set1.contains(z) != set2.contains(z)) {
                    set3.add(z);
                }
            }
            for (String x : set3) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
