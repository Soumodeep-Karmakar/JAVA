package college.Assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();
        Deleteconstant dc1=new Deleteconstant();
        dc1.delete(s);
    }
}
