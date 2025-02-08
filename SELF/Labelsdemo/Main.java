package Labelsdemo;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        ImageIcon image=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Labelsdemo/logo1.jpg");
        Border border=BorderFactory.createLineBorder(Color.GREEN, 3);
        JLabel label=new JLabel();//creat label
        label.setText("Do you even code ?");//set text of lable
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left,center and right of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text bottom,center and top of imageicon
        label.setForeground(new Color(0x00FF00));//set font color of text
        label.setFont(new Font("Silentman",Font.PLAIN,20));//set font  style of text
        label.setIconTextGap(-25);//set gap of text to image
        label.setBackground(Color.DARK_GRAY);//set background color
        label.setOpaque(true);//display backgroun color
        label.setBorder(border);//set border to the label
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon + text within label
       // label.setBounds(0, 0, 250, 250);//set x,y position of frame as well as dimensions
        
        JFrame frame=new JFrame();//creat a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        //frame.setSize(500,500);//set x-dimention,and y-dimention of the frame
        //frame.setLayout(null);//set the layout of the frame
        frame.setVisible(true);//set visibility of the frame
        frame.add(label);//adding lable on frame
        frame.pack();//resize the frame according to labels
    }
}
