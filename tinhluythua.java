import java.util.Scanner;

public class tinhluythua {
    static long m=1000000007;
    public static long mod(long a ,long b){
        if(b==0) return 1;
        if(b%2==1) return mod(a,b-1)*a%m;
        long p=mod(a,b/2);
        return p*p%m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0 && b==0) break;
            System.out.println(mod(a,b));
        }
    }
}
