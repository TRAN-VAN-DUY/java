import java.util.Scanner;

public class tinhsofibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long[] f=new long[93];
        f[0]=0;
        f[1]=1;
        f[2]=1;
        for(int i=3;i<93;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while(t>0){
            int n=sc.nextInt();
            System.out.println(f[n]);
            t-=1;
        }
    }
}
