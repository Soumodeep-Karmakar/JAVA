package GUI;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    
    MyFrame(){
        this.setTitle("Silentman's JFrame");//set title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent frame from resize
        this.setSize(420,420);//set x-dimention,and y-dimention of the frame
        this.setVisible(true);//set visibility of the frame

        ImageIcon image = new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/GUI/logo.jpg");//creat an image icon
        this.setIconImage(image.getImage());//change frame icon image
        this.getContentPane().setBackground(Color.CYAN);//it change background color of frame
        this.getContentPane().setBackground(new Color(123,50,250));//it also change background color using RGB
  
    }
}
