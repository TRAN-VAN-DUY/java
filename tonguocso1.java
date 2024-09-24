import java.util.Scanner;

public class tonguocso1 {
    public static long uoc(int n){
        int gt=0;
        while(n%2==0){
            gt+=2;
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                gt+=i;
                n/=i;
            }
        }
        if(n>1) gt+=n;
        return gt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long tong=0;
        while(t>0){
            int n=sc.nextInt();
            tong+=uoc(n);
            t--;
        }
        System.out.println(tong);        
    }
}
