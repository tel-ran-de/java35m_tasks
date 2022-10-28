package package1;

public class Car {

    private String manufacturer;
    private String colour;
    private int productionString;

    public Car(String manufacturer, String colour, int productionString) {
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.productionString = productionString;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getProductionString() {
        return productionString;
    }

    public void setProductionString(int productionString) {
        this.productionString = productionString;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", productionString=" + productionString +
                '}';
    }
}
