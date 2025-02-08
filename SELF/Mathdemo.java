import java.util.Scanner;

public class Mathdemo {
    public static void main(String[] args) {
        double x=3.14;
        double y=-10;
        
        double z = Math.max(x, y);
        System.out.println(z);
        double k = Math.min(x, y);
        System.out.println(k);
        double l = Math.abs(y);
        System.out.println(l);
        double a = Math.sqrt(x);
        System.out.println(a);
        double b = Math.round(x);
        System.out.println(b);
        double c = Math.ceil(x);
        System.out.println(c);
        double d = Math.floor(x);
        System.out.println(d);
//////////////////////////////////////////
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the side of x");
        double m=ob.nextDouble();
        System.out.println("Enter the side of y");
        double n=ob.nextDouble();
        double o=Math.sqrt((m*m)+(n*n));
        System.out.println(o);

    }
}
