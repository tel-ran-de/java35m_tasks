package employees;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 25, 1500),
                new Employee(3, "Jack", 33, 1200),
                new Employee(5, "Nick", 19, 3200),
                new Employee(4, "Ann", 22, 2500),
                new Employee(2, "Sem", 22, 1580)
        );

        Collections.sort(employees);
        System.out.println("by id");
        System.out.println(employees);


        Collections.sort(employees, new SalaryComparator());
        System.out.println("by salary");
        System.out.println(employees);

        Collections.sort(employees,new NameComparator());
        System.out.println("by name");
        System.out.println(employees);

        Collections.sort(employees,new AgeNameComparator());
        System.out.println("by age and then name");
        System.out.println(employees);


    }
}
