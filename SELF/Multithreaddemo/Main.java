package Multithreaddemo;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
 
        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); calling thread (ex.main) waits until the specified thread dies or x milisec overed
        thread2.start();
    }
}
