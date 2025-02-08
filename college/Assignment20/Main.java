package college.Assignment20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary of the employee : ");
        float s=sc.nextFloat();

        Employee e1 = new Employee(s);
        Employee e2 = new Employee();

        e2=e1.pfandallowence(e1);

        System.out.println("The PF amount is : "+e2.pf);
        System.out.println("The allowence amount is : "+e2.allowence);
    }
}
