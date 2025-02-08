//Write a JAVA program to read the three integers a,b and c from keyboard and then print the largest value read.
package college;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Enter three numbers :");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("The large no is : "+a);
        }
        else if(b>a&&b>c){
            System.out.println("The large no is : "+b);
        }
        else{
            System.out.println("The large no is : "+c);
        }
         
    }
}
