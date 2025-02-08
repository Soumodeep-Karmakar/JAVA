package college.Assignment6;

public class Square {
    double side;
    Square(double side){
        this.side=side;
    }

    public double getVolume(){
        return this.side*this.side;
    }
}
