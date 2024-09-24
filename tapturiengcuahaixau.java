import java.util.*;

public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Set<String> st=new HashSet<>();
            String[] s1=sc.nextLine().split("\\s");
            String s2=sc.nextLine();
            for(String a:s1){
                if(!s2.contains(a)){
                    st.add(a);
                }
            }
            for(String i:st){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
