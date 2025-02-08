package college.Assignment5;

import java.util.Scanner;

public class Person {
    String name ,address;
    Scanner sc=new Scanner(System.in);
    Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void setPerson(){
      System.out.println("Enter the new name and address :");
      this.name=sc.nextLine();
      this.address=sc.nextLine();
    }
    
    public String toString(){
        return("Person[Name="+this.name+",Address="+this.address);
    }

}
