package Serializer;
//for deserialize
import java.io.*;

public class Main1 {
    public static void main(String[] args)  throws ClassNotFoundException,IOException,FileNotFoundException{
        User user =null;

        FileInputStream fileIn = new FileInputStream("/home/ubuntu/Desktop/JAVA/SELF/Serializer/s.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user=(User)in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
