package Superkeyword;

public class Main {
    public static void main(String[] args) {
        
        Hero hero1=new Hero("Batman", 22, "$$$");
        
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        Hero hero2=new Hero("Superman", 45, "everything");
        
        System.out.println(hero2.toString());
    }
}
