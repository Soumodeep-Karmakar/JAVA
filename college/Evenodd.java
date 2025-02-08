//Write a program to check the number is odd or even.Input is taken from keyboard
package college;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
