package Checkboxdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

    JCheckBox checkbox;
    JButton button;
    ImageIcon check=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Checkboxdemo/check.png");
    ImageIcon x=new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Checkboxdemo/X.png");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

        checkbox=new JCheckBox();
        checkbox.setText("I'm not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkbox.setIcon(x);
        checkbox.setSelectedIcon(check);
                                                                  
        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
           
           if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
           }           
    }
}
