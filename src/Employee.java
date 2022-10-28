public class Employee {

    String name;
    int salary;
    int numberOfHours;


    public Employee (String name,int salary,int numberOfHours){
        this.name=name;
        this.salary=salary;
        this.numberOfHours=numberOfHours;
    }

    public void addSalary(){
        if(salary<500){
            salary=salary+10;
        }
    }

    public void addSalaryIfWork(){
        if(numberOfHours>6){
            salary=salary+5;
        }
    }


}
