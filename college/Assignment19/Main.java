package college.Assignment19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the box : ");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth of the box : ");
        double b=sc.nextDouble();
        System.out.println("Enter the height of the box : ");
        double h=sc.nextDouble();

        Box b1=new Box(l, b, h);

        double result=b1.volume();

        System.out.println("The volume of the box is : "+result+" unit");

    }
}
