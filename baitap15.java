import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Point{
    int x,y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Polygon{
    private Point[] points;
    public Polygon(Point[] points){
        this.points=points;
    }
    public double getArea(){
        int n=points.length;
        double ar=0.0;
        for(int i=0;i<n;i++){
            int j=(i+1)%n;
            ar+=points[i].x*points[j].y;
            ar-=points[j].x*points[i].y;
        }
        return Math.abs(ar)/2.0;
    }
}


public class baitap15 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
