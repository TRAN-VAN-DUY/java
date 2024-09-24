import java.util.Scanner;

public class tichmatranvoichuyenvicuano {
    static int[][] transit(int[][] a,int n,int m){
        int[][] b=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
    static int[][] tich(int[][] a,int[][] b,int n,int m){
        int[][] c=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=1;h<=t;h++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] a=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            int[][] b=transit(a,n,m);
            int[][] c=tich(a,b,n,m);
            System.out.printf("Test %d:\n",h);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.printf("%d ",c[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
