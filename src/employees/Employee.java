package employees;

public class Employee implements Comparable<Employee> {
    // Есть класс Employee  с полями  id, name, age, salary.
    //    Сделать его comparable по id
    //    сделать дополнительные возможности сортировки по: salary, age, name,
    //    ageAndThenName если возраст одинаковый
    //    по имени
    //    Создать лист таких сотрудников и вывести его на э
    //    кран отсортированный всеми способами
    //    Collections.sort

    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        return this.id-emp.id ;
    }
}
