import java.util.Scanner;

public class sochinhphuong {
    public static String cp(int n){
        int x=(int)Math.sqrt((double)n);
        if(x*x==n) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(cp(n));
        }
    }
}
