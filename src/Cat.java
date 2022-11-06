public class Cat implements CanRun,CanEat {

    public static void main(String[] args) {
        CanRun cat = new Cat();
        cat.run();

    }

    @Override
    public void run() {
        System.out.println("cat runs");
    }
    public void myau(){}

    @Override
    public void canEat() {
        System.out.println("Cat eats");
    }
}
