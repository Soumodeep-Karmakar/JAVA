package Threaddemo;

public class MyThread extends Thread{
    @Override
    public void run(){
        if(this.isDaemon()==true)
        System.out.println("This demon thread is running");
        else
        System.out.println("This thread is running");
    }
}
