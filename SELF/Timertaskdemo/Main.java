package Timertaskdemo;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task=new TimerTask() {
            int counter=10;
            @Override
            public void run(){
                if(counter>0){
                    System.out.println(counter+" Seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2023);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,15);
        date.set(Calendar.HOUR_OF_DAY,20);
        date.set(Calendar.MINUTE,43);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task, 5000); //normal way

        //timer.schedule(task, date.getTime());   for system calendar

        //timer.schedule(task, 0, 1000);//for instant conuntdown
         
        //timer.schedule(task, date.getTime(), 1000);//for according to system date countdown
    }
}
