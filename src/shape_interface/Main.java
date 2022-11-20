package shape_interface;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(9);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());


        Shape rect = new Rectangle(9,9);
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
