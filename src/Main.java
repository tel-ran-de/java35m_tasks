import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter number of attempts");

        int numberOfAttempts =scanner.nextInt();

        System.out.println(numberOfAttempts);

        Employee vasia = new Employee("Vasia",1000,8);
        Employee petya = new Employee("Petya",490,5);
        Employee masha = new Employee("Masha",490,9);

        vasia.addSalary();
        vasia.addSalaryIfWork();
        petya.addSalary();
        petya.addSalaryIfWork();
        masha.addSalary();
        masha.addSalaryIfWork();

        System.out.println(vasia.salary);
        System.out.println(petya.salary);
        System.out.println(masha.salary);

        Body person1 = new Body(70.0,1.90);
        Body person2 = new Body(100.0,1.50);

        person1.calculateBMI();
        person2.calculateBMI();
	//
    }

    //3. Создать класс "Employee", имеющий:
    // - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
    // - следующие методы: addSalary() , который добавляет 10 евро к зврплате сотрудника если она меньше 500
    // и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
    // Создать несколько сотрудников и применить к ним методы



    //4.Создать метод, вычисляющий индекс массы тела (BMI)  и  печатающий результат:
    // Метод использует вес в килограммах и рост в метрах.  .
    // Метод должен быть в классе Body и выодить следующее сообщение:
    //"Underweight" если BMI  меньше 18.5
    // "Normal" if 18.5<=BMI<25
    // "Overweight" 25<=BMI<30
    // Obese  BMI>=30
    // формула для расчета BMI = weight/height*height

    //вес и рост передаются через конструктор
}
