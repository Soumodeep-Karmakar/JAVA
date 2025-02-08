package TwoDGraphics;

import java.awt.*;

import javax.swing.*;


public class MyPanel extends JPanel{
    Image image;
    MyPanel(){
       this.setPreferredSize(new Dimension(500,500));
       image=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/TwoDGraphics/smile.png").getImage();
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;

        g2d.setPaint(Color.BLUE);
        //g2d.setStroke(new BasicStroke(5));
        //g2d.drawLine(0, 0, 500, 500);
        //g2d.setPaint(Color.pink);
        //g2d.drawRect(0, 0, 100, 200);
        //g2d.fillRect(0, 0, 100, 200);
        //g2d.setPaint(Color.orange);
        //g2d.drawOval(0, 0, 100, 100);
        //g2d.fillOval(0, 0, 100, 100);
        //g2d.setPaint(Color.red);
        //g2d.drawArc(0, 0, 100, 100,0,180);
        //g2d.fillArc(0, 0, 100, 100,0,180);
        //g2d.setPaint(Color.white);
        //g2d.fillArc(0, 0, 100, 100,180,180);
        //int[] xpoints={150,250,350};
        //int[] ypoints={300,150,300};
        //g2d.setPaint(Color.yellow);
        //g2d.drawPolygon(xpoints, ypoints, 3);
        //g2d.fillPolygon(xpoints, ypoints, 3);

        //g2d.setPaint(Color.magenta);
        //g2d.setFont(new Font("Ink Free",Font.BOLD,50));
        //g2d.drawString("U R A Winner :)", 50, 50);

        g2d.drawImage(image,0,0,null);
    }
}
