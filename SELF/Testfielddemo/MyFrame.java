package Testfielddemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

    JTextField textfield;
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

        textfield=new JTextField();
        textfield.setPreferredSize(new Dimension(250,40));
        textfield.setFont(new Font("Consolas", Font.PLAIN, 35));
        textfield.setForeground(Color.GREEN);
        textfield.setBackground(Color.BLACK);
        textfield.setCaretColor(Color.WHITE);
        textfield.setText("Username");

        this.add(button);
        this.add(textfield);
        this.pack();
        this.setVisible(true);;
    }
    @Override
    public void actionPerformed(ActionEvent e){
           if(e.getSource()==button){
            System.out.println("Welcome "+textfield.getText());
            button.setEnabled(false);
            textfield.setEditable(false);
           }
    }
}
