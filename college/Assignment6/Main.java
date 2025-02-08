package college.Assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side : ");
        double side=sc.nextDouble();

        Square s=new Square(side);

        double V=s.getVolume();
        System.out.println("The area of the Square is :"+V);

        System.out.println("Enter the radius  and height: ");
        double radius=sc.nextDouble();
        double height=sc.nextDouble();

        Cylinder c=new Cylinder(radius,height);

        double v=c.getVolume();
        System.out.println("The volume of the Cylinder is :"+v);
    }
}
