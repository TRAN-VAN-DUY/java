import java.util.Scanner;

public class solienke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String n=sc.next();
            int check=1;
            if(n.length()<2) check=0;
            else{
                for(int i=0;i<n.length()-1;i++){
                    if(Math.abs(Integer.valueOf(n.charAt(i))-Integer.valueOf(n.charAt(i+1)))!=1){
                        check=0;
                        break;
                    }
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
