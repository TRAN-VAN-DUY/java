import java.util.Scanner;

public class tonggiathua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long tong=0;
        long m=1;
        for(int i=1;i<=n;i++){
            m*=i;
            tong+=m;
        }
        System.out.println(tong);
    }
}
