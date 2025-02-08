package Menubardemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
    
    JMenuBar menubar;

    JMenu fileMenu ;
    JMenu editMenu ;
    JMenu helpMenu ;

    JMenuItem loadItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;

    ImageIcon loadicon;
    ImageIcon saveicon;
    ImageIcon exiticon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadicon =new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Menubardemo/load.png");
        saveicon =new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Menubardemo/save.png");
        exiticon =new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/Menubardemo/Exit.png");

         menubar = new JMenuBar();

         fileMenu = new JMenu("File");
         editMenu = new JMenu("Edit");
         helpMenu = new JMenu("Help");

         loadItem = new JMenuItem("Load");
         saveItem = new JMenuItem("Save");
         exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadicon);
        saveItem.setIcon(saveicon);
        exitItem.setIcon(exiticon);

        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt+f for file
        editMenu.setMnemonic(KeyEvent.VK_E); //Alt+e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt+f for help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(helpMenu);

        this.setJMenuBar(menubar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loadItem){
            System.out.println("*beep boop* You successfully loaded a file");
        }
        if(e.getSource()==saveItem){
            System.out.println("*beep boop* You successfully saved a file");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
