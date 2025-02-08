package Choosecolor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Pick a color");
        button.addActionListener(this);

        label=new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is a color picker");
        label.setFont(new Font("MV boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser colorChooser=new JColorChooser();

            Color color=JColorChooser.showDialog(null, "pick a color .. i guess", Color.BLACK);

            //label.setForeground(color);
            label.setBackground(color);
        }
    }
}
