package college.Assignment20;

public class Employee {
    double salary;
    double pf;
    double allowence;

    Employee(){
        this.salary=0;
        
    }

    Employee(float salary){
        this.salary=salary;
    }

    public Employee pfandallowence(Employee e1){
        
        this.pf=this.salary * 0.12;
        
        this.allowence=this.salary * 0.2;

        return this;
    }
}
