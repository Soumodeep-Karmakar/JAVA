import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        String name="";

        while (name.isBlank()) {
            System.out.println("Enter Your name :");  
            name=ob.nextLine();          
        }
        System.out.println("Hello "+name);

        name="";
        do {
            System.out.println("Enter Your name :");  
            name=ob.nextLine();          
        }while (name.isBlank());
        System.out.println("Hello "+name);
    }
}
