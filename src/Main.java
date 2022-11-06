public class Main {

    public static void main(String[] args) {
	// Создать фабрику по производству пиццу. Фабрика должна уметь готовить следующие виды пиццы:
        //    // Гавайи, Моцарелла, Салями. Каждый вид пиццы должен уметь:
        //    // подготавливаться(накладывать ингридиенты напр), печься и упаковываться. В каждом случае должно быть
        //    // понятно о какой пицце идет речь. Класс Main не должен создавать новый обьект пицца,
        //    // а из него должен поступать "заказ" на выбор требуемого вида пиццы (обьекта) в класс
        //    // PizzaFactory, который и должен выбрать нужную пиццу для изготовления.
        //
        //    // Preparing pizza with salami, cheese,tomato
        //    // Baking pizza Salami
        //    //Packing pizza Salami

        PizzaFactory factory = new PizzaFactory();

        Pizza salami = factory.createPizza("PIZZA_SALAMI");
        salami.orderPizza();

        Pizza mozarella = factory.createPizza("PIZZA_MOZARELLA");
        mozarella.orderPizza();

        Pizza hawaii = factory.createPizza("PIZZA_HAWAII");
        hawaii.orderPizza();

        System.out.println("*************ENUM************************");

        Pizza salamiEnum = factory.createPizza(PizzaType.PIZZA_SALAMI);
        salamiEnum.orderPizza();
    }
    //


}
