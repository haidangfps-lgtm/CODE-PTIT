    package J07045;

    import java.io.File;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Scanner;

    class LoaiPhong implements Comparable<LoaiPhong>{
        private String kyhieu, name;
        private int dongiaphong;
        private double phidichvu;

        public LoaiPhong(String a) {
            Scanner sc = new Scanner(a);
            this.kyhieu = sc.next();
            this.name = sc.next();
            this.dongiaphong = sc.nextInt();
            this.phidichvu = sc.nextDouble();
        }
        @Override
        public int compareTo(LoaiPhong o) {
            return this.name.compareTo(o.name);
        }
        @Override
        public String toString() {
            return kyhieu + " " + name + " " + dongiaphong + " " + phidichvu;
        }
    }

    public class J07045 {
        public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("PHONG.in"));
            int n = Integer.parseInt(in.nextLine());
            while (n-- > 0) {
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for (LoaiPhong tmp : ds) {
                System.out.println(tmp);
            }
        }
    }
    /*
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("PHONG.in"));
        ArrayList<LoaiPhong> list = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            String kyhieu = sc.next();
            String name = sc.next();
            int dongiaphong = sc.nextInt();
            double phidichvu = sc.nextDouble();
            list.add(new LoaiPhong(kyhieu, name, dongiaphong, phidichvu));
        }
        Collections.sort(list);
        for (LoaiPhong i : list) {
            System.out.println(i);
        }
    }
     */
