package J03032;

import java.util.Scanner;

/*public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {


            String s = sc.nextLine();

            String[] format = s.trim().split("\\s+");
            for (String s1 : format) {
                for (int i = s1.length() - 1; i >= 0; i--) {
                    System.out.print(s1.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

 */
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] format = s.trim().split("\\s+");
            for(String s1 : format)
            {
                StringBuilder sb = new StringBuilder(s1);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}