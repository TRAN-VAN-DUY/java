import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int last=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==last+1){
                last=x;
                continue;
            }else{
                cnt++;
                for(int j=last+1;j<x;j++){
                    System.out.println(j);
                }
                last=x;
            }
        }
        if(cnt==0) System.out.println("Excellent!");
    }    
}
