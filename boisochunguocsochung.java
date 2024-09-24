import java.util.*;

public class boisochunguocsochung {
    public static Long gcd(Long a,Long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            Long a=sc.nextLong();
            Long b=sc.nextLong();
            Long c=gcd(a,b);
            long d=a/c*b;
            System.out.println(d+" "+c);
            t--;
        }
    }
}
