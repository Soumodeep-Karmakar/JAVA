//Write a JAVA program to calculate the Sum of the square of first 10 integers
package college;

public class Sum_of_squares {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1 ; i<=10 ; i++){
            sum=sum+Math.pow(i , 2);
        }
        System.out.println("The sum of first 10 integers is : "+sum);
    }
}
