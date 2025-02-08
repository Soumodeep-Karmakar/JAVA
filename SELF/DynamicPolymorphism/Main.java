package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animals animal;

        Scanner ob=new Scanner(System.in);
        System.out.println("What animal do you want ?");
        System.out.println("(1=Dog)  (2=Cat) : ");
        int choice=ob.nextInt();

        if(choice==1){
            animal=new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal=new Cat();
            animal.speak();
        }
        else{
            animal=new Animals();
            System.out.println("Wrong choice");
            animal.speak();
        }
    }
}
