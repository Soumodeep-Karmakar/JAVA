package Methodoverriding;

public class Dogs extends  Animals{
   @Override   // for good practice
   void speaks(){
        System.out.println("This dog barks ");
    }
}
