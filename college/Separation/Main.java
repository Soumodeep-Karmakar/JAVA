package college.Separation;

import java.util.Random;

public class Main {
    public static int[] ar=new int[5];
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        for(int i=0;i<ar.length;i++){
            ar[i]=rd.nextInt(10+30+1)-30;
        }
        System.out.println(" the elements of the array :");
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        System.out.println();
        Thread a=new Thread(new Negative());
        Thread b=new Thread(new PositiveEven());
        Thread c=new Thread(new PositiveOdd());
        a.start();
        b.start();
        c.start();
    }
}
