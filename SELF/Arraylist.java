import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<String>();

        food.add("pizza");
        food.add("Hamburger");
        food.add("Chips");

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        
        System.out.println();
        food.set(0, "shushi");
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        
        System.out.println();
        food.remove(2);
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        System.out.println();
        food.clear();
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
