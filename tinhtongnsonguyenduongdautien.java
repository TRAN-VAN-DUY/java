import java.util.Scanner;

public class tinhtongnsonguyenduongdautien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n= sc.nextInt();
            long m=(long)n*(n+1)/2;
            System.out.println(m);
            t--;
        } 
    }
}
