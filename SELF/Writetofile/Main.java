package Writetofile;

import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("/home/ubuntu/Desktop/JAVA/SELF/Writetofile/poem.txt");
            writer.write("Roses are red\nViolates are blue\nBooty booty booty booty\nRockin' everywhere!");
            writer.append("\n(A poem by Silentman)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
