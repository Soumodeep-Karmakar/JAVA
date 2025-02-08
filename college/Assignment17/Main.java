package college.Assignment17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s=sc.nextLine();

        Permutation p1=new Permutation();
        System.out.println("The permuted strings are :");
        p1.display(s);
    }
}
