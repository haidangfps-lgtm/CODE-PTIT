import java.util.Arrays;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] format = s.trim().split("");
        Arrays.sort(format);
        int count = 1;
        for(int i = 0; i < format.length - 1; i++){
            if(!format[i].equals(format[i + 1])){
                count++;
            }
        }

        System.out.println(count);

    }
}