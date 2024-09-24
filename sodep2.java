import java.util.Scanner;

public class sodep2 {
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        int sum=0;
        if(s.charAt(l)!='8' || s.charAt(r)!='8') return false;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            if(l==r){
                sum+=s.charAt(l)-'0';
            }else{
                sum+=s.charAt(l)-'0'+s.charAt(r)-'0';
            }
            l++;r--;
        }
        if(sum%10!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
