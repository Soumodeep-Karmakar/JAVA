package college.Assignment18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String s=sc.nextLine();

        CountWord cw=new CountWord();

        System.out.println("Number of words in the string : "+cw.count(s));
    }
}
