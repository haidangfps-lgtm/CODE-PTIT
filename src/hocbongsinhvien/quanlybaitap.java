package hocbongsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id;
    String name;
    String phone;
    int groupId;

    public Student(String id, String name, String phone, int groupId) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.groupId = groupId;
    }

    // Ghi đè phương thức toString để in đúng định dạng yêu cầu
    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }
}
public class quanlybaitap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();

    ArrayList<Student> students = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        String id = sc.nextLine().trim();
        String name = sc.nextLine().trim();
        String phone = sc.nextLine().trim();
        int groupId = Integer.parseInt(sc.nextLine().trim());

        students.add(new Student(id, name, phone, groupId));
    }

    String[] projects = new String[m + 1];
    for (int i = 1; i <= m; i++) {
        projects[i] = sc.nextLine().trim();
    }
    int q = Integer.parseInt(sc.nextLine().trim());
    for (int i = 0; i < q; i++) {
        int queryGroup = Integer.parseInt(sc.nextLine().trim());

        System.out.println("DANH SACH NHOM " + queryGroup + ":");
        for (Student s : students) {
            if (s.groupId == queryGroup) {
                System.out.println(s);
            }
        }
        System.out.println("Bai tap dang ky: " + projects[queryGroup]);
    }

    sc.close();
}
}
