import java.util.*;

public class tangdan_giamdan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            TreeSet<Integer> h1=new TreeSet<>();
            SortedSet<Integer> h2=new TreeSet<>(Comparator.reverseOrder());
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0) h1.add(a[i]);
                else h2.add(a[i]);
            }
            for(int x:h1){
                System.out.printf("%d ",x);
            }
            System.out.println("");
            for(int x:h2){
                System.out.printf("%d ",x);
            }
            System.out.println("");
        }       
    }
}
