package TwoDAnimation;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    final int panel_width=300;
    final int panel_height=300;
    Image enemy;
    Image background;
    Timer timer;
    int xvelocity=2;
    int yvelocity=1;
    int x=0;
    int y=0;

    MyPanel(){
       this.setPreferredSize(new Dimension(panel_width,panel_height));
       this.setBackground(Color.BLACK);
       background=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/TwoDAnimation/sky.jpg").getImage();
       enemy=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/TwoDAnimation/enemy.png").getImage();
       timer=new Timer(10,this);
       timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);//paint background
        Graphics2D g2d=(Graphics2D)g;
         
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);
    }
    public void actionPerformed(ActionEvent e){
        if(x>=panel_width-enemy.getWidth(null)||x<0){
            xvelocity=xvelocity*-1;
        }
           x=x+xvelocity;
           if(y>=panel_height-enemy.getHeight(null)||y<0){
            yvelocity=yvelocity*-1;
        }
           y=y+yvelocity;
           repaint();
    }
    
}
