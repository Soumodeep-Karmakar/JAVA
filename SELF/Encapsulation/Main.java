package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Chevrollete", "camaro", 2021);

        //System.out.println(car.make);
        //System.out.println(car.model);    //for private attribute it's not possible
        //System.out.println(car.year);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2023);
        
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
