import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        long c,s;
        c=2*(n+m);
        s=n*m;
        if (n<=0 || m<=0){
            System.out.println(0);
        }
        else{
            System.out.println(c+" "+s);
        }
    }
}
