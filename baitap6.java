import java.util.Scanner;

public class baitap6 {
    static String ten(String s){
        String s1=s.substring(0, 1);
        String s2=s.substring(1,s.length());
        s1=s1.toUpperCase();
        return s1+s2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            s=s.toLowerCase();
            s=s.replaceAll("\\s+"," ");
            s=s.trim();
            String[] s1=s.split("\\s");
            if(n==1){
                System.out.printf(ten(s1[s1.length-1])+" ");
                for(int i=0;i<s1.length-1;i++){
                    System.out.printf(ten(s1[i])+" ");
                }
                System.out.println(" ");
            }else if(n==2){
                for(int i=1;i<s1.length;i++){
                    System.out.printf(ten(s1[i])+" ");
                }
                System.out.printf(ten(s1[0])+" ");
                System.out.println(" ");
            }
        }
    }
}
