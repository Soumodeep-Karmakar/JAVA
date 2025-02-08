import java.util.ArrayList;

public class Foreachloop {
    public static void main(String[] args) {
        String[] animals={"cat","dog","rat","bird"};

        for(String i: animals){
            System.out.println(i);
        }

        System.out.println();

        ArrayList<String> Animals=new ArrayList<String>();

        Animals.add("Deer");
        Animals.add("Lion");
        Animals.add("Tiger");

        for(String i: Animals){
            System.out.println(i);
        }
    }
}
