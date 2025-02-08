package college;

public class Complex5 {
    double real,imag;
    Complex5 conjugate(Complex1 z2){
        Complex5 temp=new Complex5();
        temp.real=z2.real;
        temp.imag=z2.imag;
        return temp;
     }    
}
