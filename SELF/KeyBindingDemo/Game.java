package KeyBindingDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Game {
    JFrame frame;
    JLabel label;
     
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game(){
       frame = new JFrame("Key Binding Demo");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420, 420);
       frame.setLayout(null);

       label=new JLabel();
       label.setBackground(Color.RED);
       label.setBounds(100,100,100,100);
       label.setOpaque(true);

       upAction=new UpAction();
       downAction=new DownAction();
       leftAction=new LeftAction();
       rightAction=new RightAction();

       label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "up");
       label.getActionMap().put("up", upAction);
       label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
       label.getActionMap().put("down", downAction);
       label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
       label.getActionMap().put("left", leftAction);
       label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
       label.getActionMap().put("right", rightAction);

       frame.add(label);
       frame.setVisible(true);
    }
    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
          label.setLocation(label.getX(),label.getY()-10);
        }
    }
     public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
           label.setLocation(label.getX(),label.getY()+10);
        }
    }
     public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()-10,label.getY());
        }
    }
     public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()+10,label.getY());
        }
    }
}
