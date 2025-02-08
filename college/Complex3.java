package college;

public class Complex3 {
   
    double real,imag;
        Complex3 mult(Complex1 z1,Complex1 z2){
        Complex3 temp=new Complex3();
        temp.real=(z1.real*z2.real)-(z1.imag*z2.imag);
        temp.imag=(z1.real*z2.imag)+(z1.imag*z2.real);
        return temp;
    }
}
