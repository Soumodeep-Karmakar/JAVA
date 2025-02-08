package college;

public class Complex2 {
    double real,imag;
    Complex2 sub(Complex1 z1,Complex1 z2){
        Complex2 temp=new Complex2();
        temp.real=z1.real-z2.real;
        temp.imag=z1.imag-z2.imag;
        return temp;
    }
}

