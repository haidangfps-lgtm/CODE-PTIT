import java.io.IOException;
import java.util.Scanner;

class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public String getColor() {
        return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double S(){
        return width*height;
    }
    public double R(){
        return (width+height) * 2;
    }
    @Override
    public String toString() {
        return String.format("%d %d %s", (int)R(), (int)S(), getColor());
    }
}

public class J04002 {
    public static void main(String[] args) throws IOException ,NumberFormatException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            String color = sc.next();
            if(width > 0 && height > 0){
                System.out.println(new Rectange(width,height,color));
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
