import java.util.Scanner;

public class mangdoixung {
    public static String check(int[] a,int n){
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-i-1]) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(check(a,n));
        }
    }   
}
