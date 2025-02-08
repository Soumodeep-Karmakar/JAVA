package college.Assignment23;

public class Manager extends Employee{
    float gross_salary;
    float deduction;

    Manager(float gross_salary,float deduction){
        this.gross_salary=gross_salary;
        this.deduction=deduction;
    }

    float net_salary(){
       return gross_salary-deduction; 
    }
    @Override
    public void display(float NS){
         System.out.println();
        System.out.println("Gross Salary of manager is : "+gross_salary);
        System.out.println("Total Deduction is : "+deduction);
        System.out.println("Net Salary of manager is : "+NS);
        System.out.println();
   }
}
