package college.Assignment15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String s1=sc.nextLine();

        System.out.println("Enter the first string : ");
        String s2=sc.nextLine();

        Compare c1=new Compare();
        boolean B=c1.compare(s1, s2);

        if(B==false){
            System.out.println("Lexicographically First string is "+s1);
            System.out.println("Lexicographically Second string is "+s2);
        }
        else{
            System.out.println("Lexicographically First string is "+s2);
            System.out.println("Lexicographically Second string is "+s1);
        }
    }
}
