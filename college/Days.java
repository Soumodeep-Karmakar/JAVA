//Write program to find number of days in a month using switch case.Month number and year is taken as a input from keyboard.
package college;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int m = 0;
        int y=  0;
        System.out.printf("Enter the Year : ");
        y = input.nextInt();
        if(y%4!=0){
            System.out.printf("Enter the Month Number : ");
		m = input.nextInt();
		switch(m)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30");
				break;
			case 2:
				System.out.print("Number of Days 28");
				break;
			default:
				System.out.printf("Invalid...Please Enter the 1 to 12...");
				break;
		}		
        }
        else{
            System.out.printf("Enter the Month Number : ");
		m = input.nextInt();
		switch(m)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.print("Number of Days 31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print("Number of Days 30");
				break;
			case 2:
				System.out.print("Number of Days 29");
				break;
			default:
				System.out.printf("Invalid...Please Enter the 1 to 12...");
				break;
		}		
        }
		
    }
}
