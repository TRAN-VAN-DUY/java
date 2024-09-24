import java.util.Scanner;
public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        if(a==0 && b==0){
            System.out.println("VSN");
        }else if(a==0 && b!=0){
            System.out.println("VN");
        }else{
            float s=-1*b/a;
            System.out.printf("%.2f",s);
        }
    }
}
