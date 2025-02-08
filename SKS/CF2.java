package SKS;

import java.util.Scanner;

public class CF2 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of watermelon :");
        int w=sc.nextInt();

        if (w%2==0) {
            for(i=1,j=w-1;i<=(w/2)&&j>=(w/2);i++,j--){
                if(i%2==0 && j%2==0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
        else{
            System.out.println("Not Possible");
        }
    }
}
