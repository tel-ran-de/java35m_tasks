package cars;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    private int price;

    public Car(int year, String model, int price) {
        this.year = year;
        this.model = model;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getPrice()-o.getPrice();
    }
}
