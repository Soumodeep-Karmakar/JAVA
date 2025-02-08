package LambdaExpression;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    JButton button =new JButton("My Button");
    JButton button2 =new JButton("Your Button");
    MyFrame(){

        button.setBounds(100, 100, 200, 100);
        button.addActionListener((e)->System.out.println("You clicked my button"));

        button2.setBounds(100, 200, 200, 100);
        button2.addActionListener((e)->System.out.println("You clicked your button"));

        this.add(button);
        this.add(button2);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(420,420);
         this.setLayout(null);
         this.setVisible(true);
    }
}
