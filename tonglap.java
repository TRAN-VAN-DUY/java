import java.util.*;
import java.math.BigInteger;

public class tonglap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        while(s.length()>1){
            String s1=s.substring(0,s.length()/2);
            String s2=s.substring(s.length()/2);
            BigInteger sum=new BigInteger(s1).add(new BigInteger(s2));
            System.out.println(sum);
            s=String.valueOf(sum);
        }
    }
}
