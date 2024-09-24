import java.util.Scanner;

public class sokhonglienke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            int check=1;
            int tong=n.charAt(0)-'0';
            if(n.length()<3) check=0;
            else{
                for(int i=1;i<n.length();i++){
                    tong+=n.charAt(i)-'0';
                    if(Math.abs(n.charAt(i)-n.charAt(i-1))!=2){
                        check=0;
                        break;
                    }
                }
            }
            if(check==1 && tong%10==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
