//Write JAVA program to Add two numbers,take input as command line argument.
package college;

public class Add {
    public static void main(String[] args) {
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        System.out.println(a+b);
    }
}
