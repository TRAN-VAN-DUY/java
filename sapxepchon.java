import java.util.Scanner;

public class sapxepchon {
    static void out(int[] a,int n,int step){
        System.out.printf("Buoc %d:",step);
        for(int i=0;i<n;i++){
            System.out.printf(" %d",a[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(a[index]>a[j]){
                    index=j;
                }
            }
            int tmp=a[i];
            a[i]=a[index];
            a[index]=tmp;
            out(a,n,i+1);
        }
    }
}
