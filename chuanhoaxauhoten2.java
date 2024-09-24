import java.util.Scanner;

public class chuanhoaxauhoten2 {
    static String ho(String s){
        return s.toUpperCase();
    }
    static String ten(String s){
        String s1=s.substring(0, 1);
        String s2=s.substring(1,s.length());
        s1=s1.toUpperCase();
        return s1+s2.toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t-=1;
            String s=sc.nextLine();
            s=s.toLowerCase();
            s=s.replaceAll("\\s+"," ");
            s=s.trim();
            String[] s1=s.split("\\s");
            for(int i=1;i<s1.length;i++){
                if(i==s1.length-1){
                    System.out.printf(ten(s1[i])+",");
                }else{
                    System.out.printf(ten(s1[i])+" ");
                }
            }
            System.out.printf(" "+ho(s1[0]));
            System.out.println("");
        }
    }
}
