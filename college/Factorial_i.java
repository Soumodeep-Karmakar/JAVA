//Write a JAVA program  to calculate the factorial of 10(Iterative method)
package college;

public class Factorial_i {
    public static void main(String[] args) {
        double fact=1;
        for(int i=1 ; i<=10 ; i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of 10 is : "+fact);
    }
}
