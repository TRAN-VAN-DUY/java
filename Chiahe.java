import java.util.Scanner;
import java.math.BigInteger;
public class Chiahe {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        sc.nextLine();
        while(tt-->0){
            String k=sc.nextLine();
            String [] s=k.trim().split(" ");
            BigInteger a=new BigInteger(s[0]);
            BigInteger b=new BigInteger(s[1]);
            BigInteger c=new BigInteger(s[2]);
            boolean z=a.mod(c).equals(BigInteger.ZERO);
            boolean m=b.mod(c).equals(BigInteger.ZERO);
            if(z&&m){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
