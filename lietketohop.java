import java.util.Scanner;
import java.util.Stack;

public class lietketohop {
    static int n,k,ok;
    static int[] a=new int[100];
    static void ktao(){
        for(int i=1;i<=k;i++){
            a[i]=i;
        }
    }
    public static void sinh(){
        int i=k;
        while(i>=1 && a[i]==n-k+i){
            i--;
        }
        if(i==0){
            ok=0;
        }else{
            a[i]++;
            for(int j=i+1;j<=k;j++){
                a[j]=a[j-1]+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ok=1;
        int cnt=0;
        n=sc.nextInt();
        k=sc.nextInt();
        ktao();
        while(ok==1){
            cnt++;
            for(int i=1;i<=k;i++){
                System.out.printf("%d ",a[i]);
            }
            sinh();
            System.out.println("");
        }
        System.out.printf("Tong cong co %d to hop",cnt);

    }
}