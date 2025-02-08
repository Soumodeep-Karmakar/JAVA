package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racer={car,bicycle,boat};

        for(Vehicle x:racer){
            x.go();
        }
    }
}
