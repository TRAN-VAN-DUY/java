import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long maxN=0;
            for(int i=2;i<=Math.sqrt((double)n);i++){
                if(n%i==0){
                    maxN=Math.max(maxN,i);
                    while(n%i==0){
                        n/=i;
                    }
                }
            }
            if(n>1) maxN=Math.max(maxN,n);
            System.out.println(maxN);
        }        
    }
}
