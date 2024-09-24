import java.util.Scanner;
import java.util.Stack;

public class baitap9 {
    public static long cntV(int[] a){
        int n=a.length;
        long cnt=0;
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            r[i]=n;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]<a[i]){
                r[st.pop()]=i;
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            cnt+=r[i]-i-1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }       
        System.out.println(cntV(a));
    }
}
