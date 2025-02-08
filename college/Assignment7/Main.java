package college.Assignment7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleEngine v1=new VehicleEngine();

        System.out.println("Initial Speed : "+v1.speed);
        System.out.println("Initial Gear : "+v1.gear);

        System.out.println("Enter your required Speed and Gear");

        Scanner sc = new Scanner(System.in);
        int speed=sc.nextInt();
        int gear=sc.nextInt();

        v1.speedUp(speed);
        v1.changeGear(gear);

        System.out.println("Final Speed : "+v1.speed);
        System.out.println("Final Gear : "+v1.gear);
    }
}
