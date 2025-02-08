package Exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        try{
            
            System.out.println("Enter the whole number to devide");
            int x=ob.nextInt();
            System.out.println("Enter the whole number to devide by");
            int y=ob.nextInt();

            int z = x/y;

            System.out.println(z);
        }
        catch(ArithmeticException e){
            System.out.println("It is not possible IDIOT! ");
        }
        finally{
            ob.close();
        }
    }
}
