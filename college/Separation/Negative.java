package college.Separation;

public class Negative extends Main implements Runnable{
    public void run(){
        for(int i=0;i<ar.length;i++){
           if (ar[i]<0) {
             System.out.println();
             System.out.println(ar[i]+" is negative");
             System.out.println();
           }
        }
    }
}
