import java.util.Scanner;
import java.util.TreeSet;

public class hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        TreeSet<Integer> h= new TreeSet<>();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            h.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            h.add(b[i]);
        }
        for(int x:h){
            System.out.printf("%d ",x);
        }
    }
}
