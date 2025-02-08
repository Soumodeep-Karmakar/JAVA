package college.Assignment23;

public class Clerk extends Employee{
    float gross_salary;
    float deduction;

    Clerk(float gross_salary,float deduction){
        this.gross_salary=gross_salary;
        this.deduction=deduction;
    }

    float net_salary(){
       return gross_salary-deduction; 
    }
    @Override
    public void display(float NS){
         System.out.println();
        System.out.println("Gross Salary of clerk is : "+gross_salary);
        System.out.println("Total Deduction is : "+deduction);
        System.out.println("Net Salary of clerk is : "+NS);
        System.out.println();
   }
}
