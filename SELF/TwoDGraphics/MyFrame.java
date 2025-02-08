package TwoDGraphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

    MyPanel panel;
    
    MyFrame(){
        panel=new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);//this allow the frame to appear in the middle of the computer screen
        this.setVisible(true);
    }

   
}
