package J01003;

import java.util.Scanner;

public class J01003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a != 0){
            float x = -b / a;
            System.out.printf("%.2f", x);
        }
        else{
            if(b != 0){
                System.out.printf("VN");
            }
            else {
                System.out.printf("VSN");
            }
        }
    }
}
