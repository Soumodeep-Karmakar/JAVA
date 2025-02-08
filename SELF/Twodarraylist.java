import java.util.*;
public class Twodarraylist {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> grocerylist=new ArrayList<>();
        
        ArrayList<String> bekarylist=new ArrayList<String>();

        bekarylist.add("bread");
        bekarylist.add("cake");
        bekarylist.add("donut");

        ArrayList<String> producelist=new ArrayList<String>();

        producelist.add("Tomato");
        producelist.add("garlic");
        producelist.add("potato");

        ArrayList<String> drinkslist=new ArrayList<String>();

        drinkslist.add("juice");
        drinkslist.add("coffee");
        
        grocerylist.add(bekarylist);
        grocerylist.add(producelist);
        grocerylist.add(drinkslist);
         
        

        System.out.println(grocerylist);
        System.out.println(grocerylist.get(0));
        System.out.println(grocerylist.get(1).get(2));
    }
}
