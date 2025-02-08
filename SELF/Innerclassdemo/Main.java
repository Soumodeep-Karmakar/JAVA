package Innerclassdemo;

public class Main {
    public static void main(String[] args) {
        
        OutSide out = new OutSide();
        OutSide.InSide in = out.new InSide();

        System.out.println(out.x+in.y);

        in.greeting();
    }
}
