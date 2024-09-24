import java.util.*;

public class taphopsonguyen {
    public static boolean giao(int[] a,int n,int x){
        for(int i=0;i<n;i++){
            if(a[i]==x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> h=new TreeSet<>();
        int n=sc.nextInt(), m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(giao(b,m,a[i])){
                h.add(a[i]);
            }
        }
        TreeSet<Integer> h1=new TreeSet<>();
        for(int i=0;i<n;i++){
            boolean check=true;
            for(int x:h){
                if(a[i]==x){
                    check=false;
                    break;
                }
            }
            if(check) h1.add(a[i]);
        }
        TreeSet<Integer> h2=new TreeSet<>();
        for(int i=0;i<m;i++){
            boolean check=true;
            for(int x:h){
                if(b[i]==x){
                    check=false;
                    break;
                }
            }
            if(check) h2.add(b[i]);
        }
        for(int value: h){
            System.out.printf("%d ",value);
        }
        System.out.println("");
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
