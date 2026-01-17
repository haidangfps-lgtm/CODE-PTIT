import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        // Dùng ArrayList để lưu các từ không phải là int
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            // Cố gắng ép kiểu chuỗi s sang số nguyên int
            // Nếu thành công (không có lỗi) -> s là int -> Bỏ qua, không làm gì cả
            // Nếu xảy ra lỗi NumberFormatException:
            String s = sc.next();
            try {
                int n = Integer.parseInt(s);
            }
            catch(Exception e){
                list.add(s);
            }
        }
        Collections.sort(list);
      for (String s:list){
          System.out.print(s + " ");
      }
        // Sắp xếp theo thứ tự từ điển collection.sort
        // In kết quả trên một dòng duyet he list roi in ra
    }
}
