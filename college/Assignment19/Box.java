package college.Assignment19;

public class Box {
    double length;
    double breadth;
    double height;

    Box(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public double volume(){
        return this.length*this.breadth*this.height;
    }
}
