package package1;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo","Red",2020,1000);
        System.out.println(truck);

        Car truck1 = new Truck("Mersedes","black",2021,1500);
        System.out.println(truck1);

        truck1.setProductionString(2022);
        System.out.println(truck1);
    }
}
