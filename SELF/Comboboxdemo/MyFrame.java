package Comboboxdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

    JComboBox combobox;

        MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"Tiger","Lamb","Hen"};

        combobox = new JComboBox(animals);
        combobox.addActionListener(this);

        //some of the methods
         // combobox.setEditable(true);
         //System.out.println(combobox.getItemCount());
         //combobox.addItem("Wolf");
         //combobox.insertItemAt("pig", 0);
         //combobox.setSelectedIndex(0);
         //combobox.removeItem("Tiger");
         //combobox.removeItemAt(1);
         //combobox.removeAllItems();

        this.add(combobox);
        this.pack();
        this.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==combobox){
                //System.out.println(combobox.getSelectedItem());
                System.out.println(combobox.getSelectedIndex());
            }
    }
    
}
