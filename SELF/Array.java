import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] car={"Farrari","Thar","Lambourghini"};
        for(int i=0;i<car.length;i++){
            System.out.println(car[i]);
        }

        Scanner ob=new Scanner(System.in);
        String[] day=new String[4];

        for(int i=0;i<day.length;i++){
            System.out.println("Enter the day");
            day[i]=ob.next();
        }
        for(int i=0;i<day.length;i++){
            System.out.println(day[i]);
        }
    }
}
