// JAVA NOTE 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         System.out.println("Hello World!");// For newline print
        System.out.print("It's beautiful\n");// For newline print with print
        System.out.println("\"Hello World!\"");//For quoted text
        System.out.print("\\It's beautiful\\");// For backslash "\" print with text
        // "\"=escape sequence.
        System.out.print("\n");
        int x = 123;//initialization
        int y;//declaration
        y=234;//assignment
        long z=1278234627436849337L;
        float a=3.14f;
        double b=3.14;
        boolean c = true;
        char d='@';
        String name="Silentman";
        System.out.println(x);//print variable's value without a string
        System.out.println("My number : "+y);//print variable's value with a string
        System.out.println(z);//print long value
        System.out.println(a);//print float value
        System.out.println(b);//print double value
        System.out.println(c);//print boolean value
        System.out.println(d);//print char value
        System.out.println(name);//print string value
//////////////////////////////////////////////////////////////////////////////////////
        // swap two variable
        String s="Hello";
        String k="World";
        String temp;
        temp=s;
        s=k;
        k=temp;
        System.out.println("s :"+s);
        System.out.println("k :"+k);
//////////////////////////////////////////////////////////////////////////////////////
        // USER INPUT
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name1=sc.nextLine();
        System.out.println("Enter your age :");
        int age1=sc.nextInt();
        sc.nextLine();
        System.out.println("What's your favourite food ?");
        String food=sc.nextLine();
        System.out.println("Hello "+name1);
        System.out.println("You are "+age1+" years old" );
        System.out.println("Your favourite  food : "+food);
//////////////////////////////////////////////////////////////////////////////////////
        //Expressions
        int friends=10;
        friends=friends+1;
        System.out.println(friends);
        friends--;
        System.out.println(friends);
        double friend;
        friend=(double)friends/3;
        System.out.println(friend);
//////////////////////////////////////////////////////////////////////////////////////               
    }

}