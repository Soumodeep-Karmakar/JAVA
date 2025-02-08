package college.Assignment5;

public class Student extends Person{
    String program,year;
    double fees;
    Student(String name,String address,String program,String year,double fees){
        
        super(name,address);
        this.program=program;
        this.year=year;
        this.fees=fees;
    }
    public void setPerson(){
        super.setPerson();
        System.out.println("Enter the new Program ,year and fees :");
        this.program=sc.nextLine();
        this.year=sc.nextLine();
        this.fees=sc.nextDouble();
      }
      
      public String toString(){
          return(super.toString()+",Program ="+this.program+",Year ="+this.year+",Fees ="+this.fees);
      }
}
