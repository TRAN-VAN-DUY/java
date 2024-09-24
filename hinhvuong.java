import java.util.Scanner;

public class hinhvuong {
    public static int min4(int a,int b,int c,int d){
        return Math.min(Math.min(Math.min(a,b),c),d);
    }
    public static int max4(int a,int b,int c,int d){
        return Math.max(Math.max(Math.max(a,b),c),d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1x=sc.nextInt();
        int a1y=sc.nextInt();
        int a2x=sc.nextInt();
        int a2y=sc.nextInt();
        int a3x=sc.nextInt();
        int a3y=sc.nextInt();
        int a4x=sc.nextInt();
        int a4y=sc.nextInt();
        int minx=min4(a1x,a2x,a3x,a4x);
        int maxx=max4(a1x,a2x,a3x,a4x);
        int miny=min4(a1y,a2y,a3y,a4y);
        int maxy=max4(a1y,a2y,a3y,a4y);
        int c=Math.max(maxx-minx,maxy-miny);
        System.out.println(c*c);
    }
}
