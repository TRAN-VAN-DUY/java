import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            long tich=1;
            long sum=0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    if((s.charAt(i)-'0')!=0){
                        tich*=s.charAt(i)-'0';
                    }
                }else{
                    sum+=s.charAt(i)-'0';
                }
            }
            System.out.print(tich+" "+sum);
            System.out.println(" ");
        }
    }
}
