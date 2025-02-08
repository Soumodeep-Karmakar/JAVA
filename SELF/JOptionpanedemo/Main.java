package JOptionpanedemo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "This is a Plain text .", "Plain", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a info text .", "Plain", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a  text ?", "Plain", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a warning text .", "Plain", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a error text .", "Plain", JOptionPane.ERROR_MESSAGE);

        System.out.println(JOptionPane.showConfirmDialog(null, "What do you want?", "fun", JOptionPane.YES_NO_CANCEL_OPTION));
        System.out.println(JOptionPane.showInputDialog("Whats your name"));

        String[] fun={"need","not need","wow"};

        JOptionPane.showOptionDialog(null, "This is for fun", "message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, fun, 0);
    }
}
