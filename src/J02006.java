import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeSet<Integer> list1 = new TreeSet<>();
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            list1.add(a[i]);
        }
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
        }
        for(Integer i : b){
            if((!list1.contains(i))){
                list1.add(i);
            }
        }
        for(Integer I : list1){
            System.out.print(I + " ");
        };

    }
}
