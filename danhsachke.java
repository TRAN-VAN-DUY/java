import java.util.Scanner;

public class danhsachke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<n;j++){
            System.out.printf("List(%d) = ",j+1);
            for(int i=0;i<n;i++){
                if(a[j][i]==1){
                    System.out.printf("%d ",i+1);
                }
            }
            System.out.println("");
        }
    }
}
