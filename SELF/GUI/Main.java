package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
       //only in main class
        /*  JFrame frame=new JFrame();//creat a frame
        frame.setTitle("Silentman's JFrame");//set title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//prevent frame from resize
        frame.setSize(420,420);//set x-dimention,and y-dimention of the frame
        frame.setVisible(true);//set visibility of the frame

        ImageIcon image = new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/GUI/logo.jpg");//creat an image icon
        frame.setIconImage(image.getImage());//change frame icon image
        frame.getContentPane().setBackground(Color.CYAN);//it change background color of frame
        frame.getContentPane().setBackground(new Color(123,50,250));//it also change background color using RGB
        */
        //creating a sub class of Jframe
        MyFrame frame=new MyFrame();
    }
}
