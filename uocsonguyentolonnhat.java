import java.util.Scanner;

public class uocsonguyentolonnhat {
    public static boolean nto(Long n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long ln=1;
            Long n=sc.nextLong();
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(nto(i)) ln=Math.max(ln,i);
                    if(n/i!=i && nto(n/i)){
                        ln=Math.max(ln,n/i);
                    }
                }
            }
            System.out.println(ln);
            t--;
        }
    }
}
