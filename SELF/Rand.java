import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random ob=new Random();
        int x=ob.nextInt(6);
        System.out.println(x);
        double y=ob.nextDouble();
        System.out.println(y);
        boolean z=ob.nextBoolean();
        System.out.println(z);
    }
}
