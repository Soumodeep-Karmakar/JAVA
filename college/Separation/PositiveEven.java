package college.Separation;

public class PositiveEven extends Main implements Runnable{
    public void run(){
        for(int i=0;i<ar.length;i++){
            if (ar[i]>=0 && ar[i]%2==0) {
              System.out.println();
              System.out.println(ar[i]+" is positive even");
              System.out.println();
            }
         }
    }
}
