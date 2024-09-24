import java.util.*;
class user{
    String name;
    String password;
    user(String name,String password){
        this.name=name;
        this.password=password;
    }
    boolean check(String name,String password){
        return this.name.equals(name) && this.password.equals(password);
    }
}
public class lopuser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        user[] u=new user[n];
        for(int i=0;i<n;i++){
            String[] s=sc.nextLine().split("\\s");
            String username=s[0];
            String password=s[1];
            u[i]=new user(username,password);
        }
        int m=sc.nextInt();
        sc.nextLine();
        int[] l=new int[n];
        for(int i=0;i<m;i++){
            String[] login=sc.nextLine().split("\\s");
            String loginname=login[0];
            String loginpass=login[1];
            for(int j=0;j<n;j++){
                if(u[j].check(loginname,loginpass)){
                    l[j]++;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(l[i]+" ");
        }
    }
}
