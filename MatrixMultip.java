import java.util.*;
public class MatrixMultip{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column of Matrix A: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the row and column of Matrix B: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] MatA=new int[r1][c1];
        int[][] MatB=new int[r2][c2];
        if(c1==r2){
            System.out.println("Enter value for Matrix : "+r1+" X "+c1);
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    MatA[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter value for Matrix : "+r2+" X "+c2);
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    MatB[i][j]=sc.nextInt();
                }
            }
            int[][] resMat=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        resMat[i][j]+=MatA[i][k]*MatB[k][j];
                    }
                }
            }
            System.out.println("Matrix after Multiplication: "+r1+" X "+c2);
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(resMat[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Enter proper row and column");
        }
    }
}
