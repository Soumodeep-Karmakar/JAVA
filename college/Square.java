//Write JAVA program to calculate the Square of a number
package college;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.pow(sc.nextDouble(), 2));
    }
}
