import java.util.Scanner;

public class chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String chuoi=sc.nextLine();
        int dem1=0;
        int dem2=0;
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i)=='4'){
                dem1++;
            }else if(chuoi.charAt(i)=='7'){
                dem2++;
            }
        }
        if(dem1+dem2==7 || dem1+dem2==4) System.out.println("YES");
        else System.out.println("NO");
    }
}
