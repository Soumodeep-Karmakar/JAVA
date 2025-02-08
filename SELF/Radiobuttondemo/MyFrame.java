package Radiobuttondemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton=new JRadioButton("pizza");
        hamburgerButton=new JRadioButton("hamburger");
        hotdogButton=new JRadioButton("hotdog");

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        //pizzaButton.setIcon(null);for set icon to radio button first creat image icon then do this

        ButtonGroup group =new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
           
                   if(e.getSource()==pizzaButton){
                    System.out.println("you ordered pizza");
                   }
                   else if(e.getSource()==hamburgerButton){
                    System.out.println("you ordered hamburger");
                   }
                   else if(e.getSource()==hotdogButton){
                    System.out.println("you ordered hotdog");
                   }
    }
}
