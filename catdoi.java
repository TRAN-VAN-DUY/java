import java.util.Scanner;

public class catdoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            String s=n+"";
            int check=1;
            String s1="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='1'){
                    s1+='1';
                }else if(c=='0' || c=='8' || c=='9'){
                    s1+='0';
                }else{
                    check=0;
                    break;
                }
            }
            if(check==0) System.out.println("INVALID");
            else{
                long x=Long.valueOf(s1);
                if(x==0) System.out.println("INVALID");
                else{
                    System.out.println(x);
                }
            }
            t--;
        }
    }    
}
