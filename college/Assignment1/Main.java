package college.Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar= new int[10];
        System.out.println("Enter the no of array elements :");
        int n=sc.nextInt();
        System.out.println("Enter the values for array :");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        Sort s1=new Sort();
         s1.sort(ar, n);
        
    }
}
