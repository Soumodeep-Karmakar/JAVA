import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=ob.nextInt();
        System.out.println("Enter the no of columns");
        int columns=ob.nextInt();
        System.out.println("Enter the symbol to use");
        String symbol=ob.next();
        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
