package Audiofile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner ob = new Scanner(System.in);
        
        File file =new File("/home/ubuntu/Desktop/JAVA/SELF/Audiofile/Tere Bin .wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        
        String response="";

        while (!response.equals("Q")) {
            System.out.println("P=play  , S= stop, R=restart, Q=quit");
            System.out.println("Enter your choice");

            response=ob.next();
            response=response.toUpperCase();

            switch (response) {
                case "P":clip.start(); 
                    break;
                case "S":clip.stop();
                    break;
                case "R":clip.setMicrosecondPosition(0);
                    break;
                case "Q":clip.close();
                    break;  
                default:System.out.println("No valid input");
                    break;
            }
        }
        System.out.println("Byeeeee :)");
    }    
}
