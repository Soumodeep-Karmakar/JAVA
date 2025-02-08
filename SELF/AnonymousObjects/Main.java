package AnonymousObjects;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        ArrayList<JLabel> emojis=new ArrayList<JLabel>();

       /*  ImageIcon smile = new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/AnonymousObjects/smile.png");
        JLabel smiLabel=new JLabel(smile);
        emojis.add(smiLabel);

        ImageIcon pain = new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/AnonymousObjects/pain.png");
        JLabel paiLabel=new JLabel(pain);
        emojis.add(paiLabel);
 */
        emojis.add(new JLabel(new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/AnonymousObjects/smile.png")));
        emojis.add(new JLabel(new ImageIcon("/home/ubuntu/Desktop/JAVA/SELF/AnonymousObjects/pain.png")));

        
        frame.add(emojis.get(0));
        frame.add(emojis.get(1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
