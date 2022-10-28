public class Manager extends Employee {

    String level;
    DateOfEmployment date;

    public Manager(String name, int salary, int numberOfHours,String level) {
        super(name, salary, numberOfHours);
        this.level=level;
    }
}
