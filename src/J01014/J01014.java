import java.util.Scanner;

public class J01014 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.next());
       while (t-- > 0) {
           long n =  sc.nextLong();
           long a = -1;
           for(long i = 2;i <=Math.sqrt(n);i++){
               if(n % i == 0){
                   while(n % i == 0){
                       n = n / i;
                   }
               }
           }
           if(n != 0){
               a = n;
           }
           System.out.println(a);
       }
   }
}