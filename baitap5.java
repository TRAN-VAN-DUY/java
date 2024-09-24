import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] st=s.split("\\s");
            for(int i=st.length-1;i>=0;i--){
                System.out.print(st[i]+" ");
            }      
            System.out.println(" ");      
        }        
    }
}
