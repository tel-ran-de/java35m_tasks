package shape_interface;

public class Rectangle implements Shape {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public double area() {
        return length*width;
    }
}
