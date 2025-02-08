package college;

public class Complex4 {
        float magnitude(Complex1 z1){
           float temp=(float)Math.pow((Math.pow(z1.real, 2)+Math.pow(z1.imag, 2)), 0.5);
           return temp;
        }    
}
