package college.Assignment7;

public class VehicleEngine implements SpeedGear{
    int speed;
    int gear;

    VehicleEngine(){
        this.speed=0;
        this.gear=0;
    }

    public void speedUp(int value){
         speed+=value;
    }
    public void changeGear(int value){
        gear+=value;
    }
}
