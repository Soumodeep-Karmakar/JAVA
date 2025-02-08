package arrayofobjects;

public class Main {
    public static void main(String[] args) {
      //method 1  
        Food ob1=new Food("Pizza");
        Food ob2=new Food("Hamburger");
        Food ob3=new Food("Chicken Tikka");

        Food[] refrigarator={ob1,ob2,ob3};

        for(int i=0;i<refrigarator.length;i++){
            System.out.println(refrigarator[i].name);
            //System.out.println(refrigarator[i]);   it will print the object's location in memory not value
        }
      //method 2
        Food[] refrigarator1=new Food[3];
        
        Food ob4=new Food("Apple");
        Food ob5=new Food("Banna");
        Food ob6=new Food("Pine Apple");

        refrigarator1[0]=ob4;
        refrigarator1[1]=ob5;
        refrigarator1[2]=ob6;

        for(int i=0;i<refrigarator1.length;i++){
            System.out.println(refrigarator1[i].name);
            //System.out.println(refrigarator[i]);   it will print the object's location in memory not value
        }
    }
}
