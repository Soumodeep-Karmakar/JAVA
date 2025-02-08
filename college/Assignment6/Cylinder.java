package college.Assignment6;

public class Cylinder extends Square{
    double height;
    Cylinder(double side,double height){
        super(side);
        this.height=height;
    }

    @Override
    public double getVolume(){
        return 3.14*(this.side*this.side)*height;
    }

}
