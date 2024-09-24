import java.util.Scanner;

public class sodep1 {
    static boolean stn(String s){
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            if((s.charAt(l)-'0')%2==1 || (s.charAt(r)-'0'%2==1)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(stn(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
