package college.Assignment21;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  size of array :");
        int n=sc.nextInt();
        try {
            checkSize(n);
        } catch (Exception e) {
            System.out.println("A problem occured : "+e);
        }
    }

    static void checkSize(int n) throws NegativeArraySizeException{
        if(n<0){
            throw new NegativeArraySizeException("\n"+"Array size must be Positive");
        }
        else{
            int[] ar = new int[n];
            System.out.println("Array is created");
        }
    }
}

