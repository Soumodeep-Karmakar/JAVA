package Keylistenerdemo;

import java.awt.Color;  
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{

    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Keylistenerdemo/rocket-icon.png");
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label=new JLabel();
        //label.setBackground(Color.RED);
        label.setBounds(0,0,100,100);
        //label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e){
        //keypressed=Invoke when a physical key is pressed down . uses keycode , int output
        switch (e.getKeyCode()) {
            case 37:label.setLocation(label.getX()-10,label.getY());
                 break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
                 break;
            case 39:label.setLocation(label.getX()+10,label.getY());
                 break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
                 break;        
            default:
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
       //keyreleased=called whenever a button is released
       System.out.println("You released key char "+e.getKeyChar());
      System.out.println("You released key code "+e.getKeyCode());
    }
    @Override
    public void keyTyped(KeyEvent e){
      //keytyped=Invoke when a key is typed.uses keychar,char output  
      switch (e.getKeyChar()) {
            case 'a':label.setLocation(label.getX()-10,label.getY());
                 break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
                 break;
            case 'd':label.setLocation(label.getX()+10,label.getY());
                 break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
                 break;        
            default:
                break;
        }       
    }
}
