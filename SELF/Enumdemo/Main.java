package Enumdemo;

/* level 1 
enum Planets{
    MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANAS,NEPTUNE,PLUTO;
}
public class Main {
    public static void main(String[] args) {
        Planets myPlanet=Planets.MARS;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planets myPlanet){
        switch (myPlanet) {
            case EARTH:System.out.println("You can live here");
                
                break;
        
            default:System.out.println("You can't live here......yet");
                break;
        }
    }
}*/

//level 2
enum Planets{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANAS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;
    Planets(int number){
           this.number=number;
    }
}
public class Main {
    public static void main(String[] args) {
        Planets myPlanet=Planets.EARTH;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planets myPlanet){
        switch (myPlanet) {
            case EARTH:System.out.println("You can live here");
                System.out.println("This planet number = "+myPlanet.number);
                break;
        
            default:System.out.println("You can't live here......yet");
            System.out.println("This planet number = "+myPlanet.number);
                break;
        }
    }
}
