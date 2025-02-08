//Write a JAVA program  to calculate the factorial of 10(recurssive method)
package college;

public class Factorial_r {
    public static void main(String[] args) {
        int num = 10;
        long factorial = factorial1(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long factorial1(int num)
    {
        if (num >= 1)
            return num * factorial1(num - 1);
        else
            return 1;
    }
}
