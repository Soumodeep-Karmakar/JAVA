package college;

public class Complex1 {
    double real,imag;
    Complex1(){

    }
    Complex1(double tempreal,double tempimag){
        real=tempreal;
        imag=tempimag;
    }
    Complex1 add(Complex1 z1,Complex1 z2){
        Complex1 temp=new Complex1();
        temp.real=z1.real+z2.real;
        temp.imag=z1.imag+z2.imag;
        return temp;
    }
}
