public class Employee {
/*Создать класс Employee со следующими переменными:
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String position;
        Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
        а также метод  public String getFullName().

        Создать и вывести на экран несколько обьектов этого класса
*/
private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String position;

    public Employee(){}

    public Employee(int id, String firstName, String lastName, int age, String gender, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName(){
        return this.firstName+" "+this.lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
