package college.Applet;

import java.awt.*;
import java.awt.event.*;

public class Newwindow extends Frame{

    Label lebel;

    Newwindow(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }        
         });   
         this.setSize(500,200);
         this.setLayout(null);

         lebel=new Label();
         lebel.setBounds(0, 10, 500, 100);
         lebel.setFont(new Font("MV Boli", Font.BOLD, 30));
         lebel.setText("You've Successfully Log In");

         this.add(lebel);
         this.setVisible(true);

    }
}
