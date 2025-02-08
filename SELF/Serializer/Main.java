package Serializer;
//for serialize
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        User user = new User();

        user.name="Bro";
        user.password="I<3pizza";

        FileOutputStream fileOut = new FileOutputStream("/home/ubuntu/Desktop/JAVA/SELF/Serializer/s.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Your info is saved");
        //for getting serial version uid
        long serialversionUID=ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialversionUID);
    }
}
