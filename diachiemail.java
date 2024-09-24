import java.util.Scanner;
import java.util.HashMap;

public class diachiemail {
    public static String mail(String s){
        String[] a=s.trim().split("\\s+");
        String r=a[a.length-1];
        for(int i=0;i<a.length-1;i++){
            r+=Character.toString(a[i].charAt(0));
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> a= new HashMap<>();
        while(t-->0){
            String s=sc.nextLine();
            String user=mail(s.toLowerCase());
            if(a.get(user)==null){
                a.put(user,2);
            }else{
                int th=a.get(user);
                a.put(user,th+1);
                user+=Integer.toString(th);
            }
            System.out.println(user+"@ptit.edu.vn");
        }
    }
}
