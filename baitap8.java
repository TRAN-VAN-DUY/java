import java.util.*;

public class baitap8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++){
            int n=sc.nextInt();
            Integer[] a=new Integer[n];
            Map<Integer, Integer> st=new LinkedHashMap<>();
            Map<Integer, Integer> st1=new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                st.put(a[i],st.getOrDefault(a[i],0)+1);
                if(!st1.containsKey(a[i])){
                    st1.put(a[i],i);
                }
            }
            Arrays.sort(a,(x,y)->{
                int freqA=st.get(x);
                int freqB=st.get(y);
                if(freqA!=freqB){
                    return freqB-freqA;
                }else{
                    return st1.get(x)-st1.get(y);
                }
            });
            for(int k:a){
                System.out.print(k+" ");
            }
            System.out.println();
        }   
        sc.close();     
    }
}
