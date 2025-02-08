package Panelsdemo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Panelsdemo/icon.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);
        
        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());

        JFrame frame=new JFrame();//creat a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setSize(750,750);//set x-dimention,and y-dimention of the frame
        frame.setLayout(null);//set the layout of the frame
        frame.setVisible(true);//set visibility of the frame
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        greenpanel.add(label);
    }
}
