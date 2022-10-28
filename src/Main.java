public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAge(35);
        employee.setGender("Male");
        employee.setPosition("manager");

        System.out.println(employee);
        System.out.println(employee.getName());
    }

    //1.создать классы, содержащие методы для подсчета площади rectangle, square and circle.
    // Создать массив таких обьектов и вывести его на экран. Кроме результата должно
    // выводиться название соответствующей фигуры

    // Circle has area of 500.0
    // Rectangle zas area of 40.0

    //2. Создать фабрику по производству пиццу. Фабрика должна уметь готовить следующие виды пиццы:
    // Гавайи, Моцарелла, Салями. Каждый вид пиццы должен уметь:
    // подготавливаться(накладывать ингридиенты напр), печься и упаковываться. В каждом случае должно быть
    // понятно о какой пицце идет речь. Класс Main не должен создавать новый обьект пицца,
    // а из него должен поступать "заказ" на выбор требуемого вида пиццы (обьекта) в класс
    // PizzaFactory, который и должен выбрать нужную пиццу для изготовления.

    // Preparing pizza with salami, cheese,tomato
    // Baking pizza Salami
    //Packing pizza Salami
}
