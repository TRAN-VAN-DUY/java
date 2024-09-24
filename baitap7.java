import java.util.Scanner;

public class baitap7 {
    public static String dem(String[] s){
        int n=s.length;
        String b=s[0];
        int length=b.length();
        int minS=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                String c=s[j]+s[j];
                if(!c.contains(s[i])){
                    return "-1";
                }
                int steps=c.indexOf(s[i]);
                cnt+=steps;
            }
            minS=Math.min(minS,cnt);
        }
        return String.valueOf(minS);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine().trim();
        }        
        System.out.println(dem(s));
    }
}
