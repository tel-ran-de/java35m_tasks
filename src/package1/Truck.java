package package1;

public class Truck extends Car {

    private int loadCapacity;

    public Truck(String manufacturer, String colour, int productionString,int loadCapacity) {
        super(manufacturer, colour, productionString);
        this.loadCapacity=loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }



    @Override
    public String toString() {
        return "Truck{" + "manufacturer= "+getManufacturer()+" colour="+getColour()+" production date= "+getProductionString()+
                " loadCapacity=" + loadCapacity +
                '}';
    }
}
