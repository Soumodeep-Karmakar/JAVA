package college.Assignment23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manager's Gross salary :");
        float gs=sc.nextFloat();
        System.out.println("Enter the Manager's Total deductions :");
        float d=sc.nextFloat();

        Manager m1=new Manager(gs, d);
        float ns = m1.net_salary();
        m1.display(ns);


        System.out.println("Enter the Clerk's Gross salary :");
        float gs1=sc.nextFloat();
        System.out.println("Enter the Clerk's Total deductions :");
        float d1=sc.nextFloat();

        Clerk c1=new Clerk(gs1, d1);
        float ns1 = c1.net_salary();
        c1.display(ns1);

    }    
}
