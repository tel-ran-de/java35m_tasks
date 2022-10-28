package figures;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("Circle",10);
        Shape rectangle = new Rectangle("Rectangle",5,10);
        Shape square = new Square("Square",7);
       // Shape shape = new Shape("Shape");

        Shape[] shapes = {circle,rectangle,square};

        System.out.println("shapes:");

        for(Shape s: shapes){
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }


    }
}
