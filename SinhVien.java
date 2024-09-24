import java.util.Scanner;
public class SinhVien {
    public String msv="D22DCCN",hovaDem,ten,dg;
    public int age;
    public boolean gt;
    public double d1,d2;
    public void setDiem(double x1,double x2){
        d1=x1;
        d2=x2;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        String ms=sc.toString();
        while(ms.length()!=3){
            System.out.println("nhap sai");
            ms=sc.toString();
        }
        msv=msv+ms;
        hovaDem=sc.nextLine();
        ten=sc.nextLine();
        age=sc.nextInt();
        while(age<18 || age >23){
            System.out.println("nhap sai");
            age=sc.nextInt();
        }
        gt=sc.nextBoolean();
        d1=sc.nextDouble();
        while(d1<0 || d1>10){
            System.out.println("nhap sai");
            d1=sc.nextDouble();
        }
        d2=sc.nextDouble();
        while(d2<0 || d2>10){
            System.out.println("nhap sai");
            d2=sc.nextDouble();
        }

    }
    public void output(){
        double gpa=(d1+d2*2)/3;
        if(gpa<5) dg="yeu";
        if(gpa>=5 && gpa<6.5) dg="trung binh";
        if(gpa>=6.5 && gpa <8) dg="kha";
        if(gpa>=8 && gpa<9) dg="gioi";
        if(gpa>=9) dg="xuat sac";
        String z=gt? "nam":"nu";
        System.out.printf("%s %s %s %d %s %.1f %s\n",msv,hovaDem,ten,age,z,gpa,dg);
    }
    public String getHoVaTen() {
        return hovaDem+" "+ten;
    }
    public String getXepLoai(){
        return dg;
    }

    public static void main(String[] args) {
        SinhVien s=new SinhVien();
        s.input();
        s.setDiem(4, 8);
        s.output();
        System.out.println(s.getHoVaTen()+" "+s.getXepLoai());
    }
}
