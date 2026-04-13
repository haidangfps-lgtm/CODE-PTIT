package J04020;

import java.util.Scanner;
class Pair<a,b>{
    private a first;
    private b second;

    public Pair(a first, b second) {
        this.first = first;
        this.second = second;
    }
    public boolean checksnt(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(){

        int num1 =  (Integer) first;
        int num2 = (Integer) second;
        return checksnt(num1) && checksnt(num2);
    }
    @Override
    public String toString(){
        return first + " " + second;
    }
}
public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
