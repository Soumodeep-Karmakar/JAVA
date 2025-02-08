package college.Assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Min M1=new Min();
        
        System.out.println("Enter the row and column no");
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[][] ar = new int[m+1][n+1];

        System.out.println("Enter the elements ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements are");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }

        M1.min(ar, m, n);

    }
}
