package FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/ubuntu/Desktop/JAVA/SELF/FileClass/secret_message.txt");

        if(file.exists()){
            System.out.println("This file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
         
        else
         System.out.println("This file doesn't exist");
    }
}
