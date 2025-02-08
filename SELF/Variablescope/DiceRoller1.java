package Variablescope;

import java.util.Random;
// for global variable 
public class DiceRoller1 {
    
    Random random;
    int number;

    DiceRoller1(){
        random=new Random();
        roll();
    }

    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}
