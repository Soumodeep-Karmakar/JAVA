package college.Assignment22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name  of first student :");
        String name=sc.nextLine();
        System.out.println("Enter the roll  of first student :");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the  stream of first student :");
        String stream=sc.nextLine();

        Student s1 = new Student(name, roll, stream);
        
        System.out.println("Enter the name  of second student");
        String name1=sc.nextLine();
        System.out.println("Enter the roll  of second student :");
        int roll1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the  stream of second student :");
        String stream1=sc.nextLine();

        Student s2 = new Student(name1, roll1, stream1);

        boolean B=s2.isEqual(s1,s2);

        System.out.println(" Two objects of student class is equal :"+B);
    }
}
