package Overloadedconstructor;

public class Main {
    public static void main(String[] args) {
        
        Pizza pizza=new Pizza("Thick crust", "tomato", "mecoroni", "Peperion");
        
        System.out.println("Here is my pizza's ingrediants:");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza pizza1=new Pizza("Thick crust", "tomato", "mecoroni");

        System.out.println("Here is my pizza's ingrediants:");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        Pizza pizza2=new Pizza("Thick crust", "tomato");
        
        System.out.println("Here is my pizza's ingrediants:");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);

        Pizza pizza3=new Pizza("Thick crust");
        
        System.out.println("Here is my pizza's ingrediants:");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.topping);

        Pizza pizza4=new Pizza();
        
        System.out.println("Here is my pizza's ingrediants:");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.topping);
        
    }
    
}
