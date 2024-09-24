import java.util.Scanner;
import java.util.Arrays;

public class baitap10 {
    private static void swap(char[] a,int i,int j){
        char tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    public static int sapXep(char[] a){
        int low=0,mid=0;
        int high=a.length-1;
        int swaps=0;
        while(mid<high){
            if(a[mid]=='X'){
                swap(a,low,mid);
                low++;
                mid++;
                swaps++;
            }else if(a[mid]=='T'){
                mid++;
            }else{
                while(a[high]=='D') high--;
                swap(a,mid,high);
                high--;
                swaps++;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] a=s.toCharArray();
        System.out.println(sapXep(a));
    }
}
