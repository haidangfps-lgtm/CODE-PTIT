import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// 1. Khai báo lớp Pair với 2 tham số Generic K và V
// 2. Viết Constructor để khởi tạo first và second
// 3. Viết hàm kiểm tra số nguyên tố (Logic toán học)
// Trả về true nếu n là số nguyên tố, ngược lại false
// 4. Viết hàm isPrime() kiểm tra cặp số hiện tại
// Gợi ý: Vì first, second là kiểu K, V (Generic)
// nên cần ép kiểu về (Integer) để dùng được hàm check(int)
// 5. Ghi đè phương thức toString để in ra theo mẫu "số1 số2"
class Pair<f , s> {
    private f first;
    private s second;

    public Pair(f first, s second) {
        this.first = first;
        this.second = second;
    }

    public boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(){
        return check((Integer) first ) && check((Integer) second);
    }
    @Override
    public String toString() {
        return first + " " + second;
    }
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) System.out.println(-1);
        }
    }
}
