/*Write a program to calculate the grade of a student. There are five subjects.
Marks in each subject are entered from keyboard. Assign grade based on
the following rule:
Total Marks >= 90      Grade: Ex
90 > Total Marks >= 80 Grade: A
80 > Total Marks >= 70 Grade: B
70 > Total Marks >= 60 Grade: C
60 > Total Marks       Grade: F
*/
package college;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of DBMS (out of 20) : ");
        double D=sc.nextDouble();
        System.out.println("Enter the No of JAVA (out of 20) : ");
        double J=sc.nextDouble();
        System.out.println("Enter the No of PYTHON (out of 20) : ");
        double P=sc.nextDouble();
        System.out.println("Enter the No of DIP (out of 20) : ");
        double Dip=sc.nextDouble();
        System.out.println("Enter the No of IS (out of 20) : ");
        double I=sc.nextDouble();

        double Total = D+J+P+Dip+I;
        if(Total >= 90){
            System.out.println("Grade: Ex");
        }
        else if(90 > Total && Total >= 80){
            System.out.println("Grade: A");
        }
        else if(80 > Total && Total >= 70){
            System.out.println("Grade: B");
        }
        else if(70 > Total && Total >= 60){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
