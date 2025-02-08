package SKS;

import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
       int count=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of  question ");
       int a=sc.nextInt();
       int[][] ar=new int[a][3];
       System.out.println("Enter the value if they can solve it type 1 and otherwise 0 ");
       for (int i = 0; i < a; i++) {
        for (int j = 0; j < 3; j++) {
            ar[i][j]=sc.nextInt();
        }
       }

       

       for (int i = 0; i < a; i++) {
           if ((ar[i][0]+ar[i][1]+ar[i][2])>=2) {
               count++;
           }
       }

       System.out.println(count);
    }
}
