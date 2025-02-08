//Write a JAVA program to multiply two numbers,numbers should be taken from standard input
package college;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        System.out.println(a*b);
    }
}
