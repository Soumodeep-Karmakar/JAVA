import java.util.Scanner;

public class Logicaloperator {
    public static void main(String[] args) {
        
        int temp=15;
        if(temp>30)
         System.out.println("It's too hot");
        else if(temp>=20 && temp<=30)
         System.out.println("It's a normal weather");
        else
         System.out.println("It's cold");

        Scanner ob=new Scanner(System.in);

        System.out.println("You are playing the game do you want to Quit . Press q or Q");
        String response=ob.next();

        if(response.equals("q")||response.equals("Q"))
         System.out.println("Quit the game");
        else
         System.out.println("You still playing");

        if(!response.equals("q")&&!response.equals("Q"))
         System.out.println("You still playing");
        else
         System.out.println("Quit the game");
    }
}
