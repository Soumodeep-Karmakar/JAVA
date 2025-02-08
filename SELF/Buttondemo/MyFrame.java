package Buttondemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        ImageIcon image=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Buttondemo/icon.png");
        ImageIcon image2=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Buttondemo/logo.png");
        label=new JLabel();
        label.setIcon(image2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button=new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(this);
        //button.addActionListener(e-> System.out.println("poo"));//when we use this method we don,t need implement Actionlistener and actionListener method at the bottom
        button.setText("Button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Silentman",Font.BOLD,25));
        button.setIconTextGap(-8);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button){
                label.setVisible(true);
                //System.out.println("poo");
            }
        }
}
