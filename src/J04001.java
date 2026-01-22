import java.util.Scanner;

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y,2) );
    }

    // can cua p1 x - p2 x binh` + p1 y - p2 y

}
public class J04001 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
          int t = Integer.parseInt(sc.nextLine());
          while(t-- > 0){
              Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
              Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
              System.out.printf("%.4f\n", Point.distance(p1,p2));
          }
      }
  }
}
