package OOP;

public class Main {
    public static void main(String[] args) {
        
        Car myCar=new Car();
        Car myCar1=new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        
        myCar1.drive();
        myCar1.brake();

    }
}
