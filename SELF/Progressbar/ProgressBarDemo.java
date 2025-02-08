package Progressbar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame =new JFrame();
    JProgressBar bar=new JProgressBar(0,500);

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.RED);
        bar.setBackground(Color.BLACK);
        
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        full();

    }

    public void full(){
        int counter =500;

        while (counter>0) {
            bar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            counter-=1;
        }
        bar.setString("Done :)");
    }
}
