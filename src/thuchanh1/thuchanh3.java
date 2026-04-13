import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;

        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            String s = sc.nextLine().trim();
            System.out.println(drmEncrypt(s));
        }

        sc.close();
    }

    private static String drmEncrypt(String s) {
        int n = s.length() / 2;
        char[] s1 = s.substring(0, n).toCharArray();
        char[] s2 = s.substring(n).toCharArray();
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += (s1[i] - 'A');
            sum2 += (s2[i] - 'A');
        }
        for (int i = 0; i < n; i++) {
            s1[i] = (char) (((s1[i] - 'A' + sum1) % 26) + 'A');
            s2[i] = (char) (((s2[i] - 'A' + sum2) % 26) + 'A');
        }
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = (char) (((s1[i] - 'A' + (s2[i] - 'A')) % 26) + 'A');
        }
        return new String(res);
    }
}