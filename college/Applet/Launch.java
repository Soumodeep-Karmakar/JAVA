package college.Applet;
import java.awt.*;
import java.awt.event.*;

public class Launch extends Frame implements ActionListener{
    Label lebel;
    Button button;
    TextField tf1;
    TextField tf2;
    Launch(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }        
         });   
         this.setSize(500,300);
         this.setLayout(null);

         lebel=new Label();
         lebel.setBounds(150, 10, 200, 100);
         lebel.setFont(new Font("MV Boli", Font.BOLD, 50));
         lebel.setText("Log In");

         tf1=new TextField();
         tf1.setBounds(100, 111, 300, 25);
         tf1.setText("@Username");

         tf2=new TextField();
         tf2.setBounds(100, 150, 300, 25);
         tf2.setText("PassWord");

         button=new Button("Log In");
         button.setBounds(230, 200, 50, 30);
         button.addActionListener(this);
          
         this.add(tf1);
         this.add(tf2);
         this.add(button);
         this.add(lebel);
         this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            Newwindow nw=new Newwindow();
        }
    }
}
