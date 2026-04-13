package J04009;

import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
public class J04009 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

   }

}
