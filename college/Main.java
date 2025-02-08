package college;

import java.util.Scanner;

public class Main {
    public int[] array=new int[10];
     int top = -1;
    public static void main(String[] args) {
        
        
            
        Thread pu=new Thread(new Pushtask()); 
        
        Thread po=new Thread(new Poptask());

       
        
            pu.start();
            po.start();
        
       
        
        
    }
     public void push(){
        
            for (int i = 0; i < array.length; i++) {
                if(top==array.length-1)
           System.out.println("Overloaded");
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the item to push :");
            int item=i;
            top= top+1;
            array[top]=item;
        }
            }
        
     }

     public void pop(){
        
            for (int i = 0; i < array.length; i++) {
                if(top==-1)
             System.out.println("Underflow");
          else{
              int item=array[top];
              top-=1;
              System.out.println(" The poped item is :"+item);
          }
            }
          
     }
    
}