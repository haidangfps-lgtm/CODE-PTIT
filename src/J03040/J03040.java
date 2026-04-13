package J03040;

import java.util.Scanner;

public class J03040 {
    public static boolean sodep(String s){
        int n = s.length();
        String digit = s.substring(5,8) + s.substring(9,11);
        char[] format = digit.toCharArray();
        int check = 1;
        for(int i = 0;i < format.length - 1;i++){
            if(format[i] >= format[i+1]){
                check = 0;
                break;
            }
        }
        if(check == 1) {
        return true;
        }
        if (format[0] == format[1] && format[1] == format[2] && format[3] == format[4]) {
            return true;
        }
        check = 1;
        for(char c : format){
            if(c != '6' && c != '8'){
                check = 0;
                break;
            }
        }
        if(check == 1){
            return true;
        }
return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int t = Integer.parseInt(sc.nextLine());
      while(t-->0){
          String s = sc.nextLine().trim();
          if(sodep(s)){
              System.out.println("YES");
          }
          else System.out.println("NO");
      }
    }
}
