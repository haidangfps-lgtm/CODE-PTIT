package J03021;
import java.util.Scanner;



public class J03021 {

    public static int Checkchar(char c){
        if(c >= 'A' && c <= 'C') return 2;
        if(c >= 'D' && c <= 'F') return 3;
        if(c >= 'G' && c <= 'I') return 4;
        if(c >= 'J' && c <= 'L') return 5;
        if(c >= 'M' && c <= 'O') return 6;
        if(c >= 'P' && c <= 'S') return 7;
        if(c >= 'T' && c <= 'V') return 8;
        if(c >= 'W' && c <= 'Z') return 9;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine().toUpperCase();
            int n = a.length();
            int check = 1;
            for (int i = 0; i < n; i++) {
                char left = a.charAt(i);
                char right = a.charAt(n - i - 1);
                if (Checkchar(left) != Checkchar(right)) {
                    check = 0;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("NO");
            } else
                System.out.println("YES");
        }
    }
}

