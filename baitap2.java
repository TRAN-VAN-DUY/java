import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            StringBuilder l=new StringBuilder();
            int sum=0;
            for(char c:s.toCharArray()){
                if(Character.isLetter(c)){
                    l.append(c);
                }else if(Character.isDigit(c)){
                    sum+=c-'0';
                }
            }
            char[] s1=l.toString().toCharArray();
            java.util.Arrays.sort(s1);
            String s2=new String(s1);
            System.out.println(s2+sum);
        }
        sc.close();        
    }
}
