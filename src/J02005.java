import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeSet<Integer> list = new TreeSet<>();
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
            list.add(a[i]);
        }
        for(int i = 0;i < m; i++){
            b[i] = sc.nextInt();
        }
        TreeSet<Integer> list2 = new TreeSet<>();
        for(Integer i : b){
            if(list.contains(i)){
                list2.add(i);
            }
        }
        for(Integer i : list2){
            System.out.print(i + " ");
        }

    }
}
