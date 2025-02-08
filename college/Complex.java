/* Define a class Complex to represent an object for a complex number like Z = X + i.Y
with the following methods:
Complex add(Complex z1, Complex z2) //To add two complex numbers
Complex sub(Complex z1, Complex z2) //To subtract two complex numbers
Complex mul(Complex z1, Complex z2) // To multiply two complex numbers
float magnitude(Complex z) // To find the modulus
Complex conjugate(Complex z) // To find the complex conjugate
Write the main class and instantiate the objects of the above mentioned classes. */
package college;

import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        System.out.println("Enter the first real and imaginary part of complex no :");
        Scanner sc = new Scanner(System.in);
        double m=sc.nextDouble();
        double n=sc.nextDouble();
        Complex1 c1=new Complex1(m,n);
        System.out.println("Enter the second real and imaginary part of complex no :");
        double o=sc.nextDouble();
        double p=sc.nextDouble();
        Complex1 c2=new Complex1(o,p);
        System.out.println("The first complex no is : "+c1.real+"+i"+c1.imag);
        System.out.println("The first complex no is : "+c2.real+"+i"+c2.imag);
        Complex1 c3=new Complex1();
        c3=c3.add(c1, c2);
        System.out.println("The result of the additon of two complex no is : "+c3.real+"+i"+c3.imag);
        Complex2 c4=new Complex2();
        c4=c4.sub(c1, c2);
        System.out.println("The result of the subtraction of two complex no is : "+c4.real+"+i"+c4.imag);
        Complex3 c5=new Complex3();
        c5=c5.mult(c1, c2);
        System.out.println("The result of the subtraction of two complex no is : "+c5.real+"+i"+c5.imag);
        Complex4 c6=new Complex4();
        float mag=c6.magnitude(c1);
        System.out.println("The magnitude of the first complex no is : "+mag);
        Complex5 c7=new Complex5();
        c7=c7.conjugate(c2);
        System.out.println("The conjugate of the second complex no is : "+c7.real+"-i"+c7.imag);
    }

    
}

