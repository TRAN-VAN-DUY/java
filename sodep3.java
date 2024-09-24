import java.util.*;

public class sodep3 {
    public static boolean nt(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt((double)n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            if(nt(s.charAt(l)-'0')==false || nt(s.charAt(l)-'0')==false) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
