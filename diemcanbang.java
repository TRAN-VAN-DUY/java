import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for(int i=1;i<n+1;i++){
                a[i]=sc.nextInt();
                a[i]+=a[i-1];
            }
            boolean oke=true;
            for(int i=2;i<n;i++){
                if(a[i]==a[n]-a[i-1]){
                    System.out.println(i);
                    oke=false;
                    break;
                }
            }
            if(oke) System.out.println(-1);
        }
    }
}
