import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class sapxepchen {
    static void out(ArrayList<Integer> a,int step){
        System.out.printf("Buoc %d: ",step);
        for(int i=0;i<step+1;i++){
            System.out.printf("%d ",a.get(i));
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
            Collections.sort(a);
            out(a,i);
        }
    }
}
