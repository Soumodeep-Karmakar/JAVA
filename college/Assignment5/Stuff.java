package college.Assignment5;

public class Stuff extends Person{
    String school;
    double pay;
    Stuff(String name,String address,String school,double pay){
        
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public void setPerson(){
        super.setPerson();
        System.out.println("Enter the new School and Pay :");
        this.school=sc.nextLine();
        this.pay=sc.nextDouble();
      }
      
      public String toString(){
          return(super.toString()+",School ="+this.school+",Pay ="+this.pay);
      }
}
