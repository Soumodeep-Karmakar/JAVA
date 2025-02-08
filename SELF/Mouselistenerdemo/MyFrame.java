package Mouselistenerdemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

    JLabel label;

    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        smile=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Mouselistenerdemo/smile.png");
        nervous=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Mouselistenerdemo/nervous.png");
        pain=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Mouselistenerdemo/pain.png");
        dizzy=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Mouselistenerdemo/dizzy.png");

        label=new JLabel();
        label.setIcon(smile);
        label.addMouseListener(this);

        /*label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);
*/
        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent e){
     //Invoke when a mouse button has been pressed on a component
     System.out.println("You pressed the mouse");
     //label.setBackground(Color.YELLOW);
     label.setIcon(pain);
    }
    @Override
    public void mouseEntered(MouseEvent e){
       //Invoke when the mouse enters a component
       System.out.println("You entered the component");
      // label.setBackground(Color.BLUE);
      label.setIcon(nervous);
    }
    @Override
    public void mouseReleased(MouseEvent e){
      //Invoke when a mouse button has been released on a component
      System.out.println("You released the mouse");
      //label.setBackground(Color.GREEN);
      label.setIcon(dizzy);
    }
    @Override
    public void mouseClicked(MouseEvent e){
      //Invoke when a mouse button has been clicked(pressed and released) on a component
      System.out.println("You clicked the mouse");
    }
    @Override
    public void mouseExited(MouseEvent e){
        //Invoke when the mouse exits a component
        System.out.println("You exited the component");
        //label.setBackground(Color.RED);
        label.setIcon(smile);
    }
}
