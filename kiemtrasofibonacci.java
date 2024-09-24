import java.util.Scanner;


public class kiemtrasofibonacci {
    public static boolean check(long n ) {
        if(n==0 || n==1) return true;
        long[] f=new long[93];
        f[0]=0;
        f[1]=1;
        f[2]=1;
        for(int i=3;i<93;i++){
            f[i]=f[i-1]+f[i-2];
            if(f[i]==n) return true;
            if(f[i]>n) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            t-=1;
        }
    }
}