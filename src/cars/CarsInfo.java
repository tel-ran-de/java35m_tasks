package cars;

import java.util.Arrays;

public class CarsInfo {

    public static void main(String[] args) {
        Car car1 = new Car(2015,"Volvo",30000);
        Car car2 = new Car(1990,"Toyota",5000);
        Car car3 = new Car(2019,"Audi",60000);
        Car car4 = new Car(1980,"Lada",1);

        Car[] cars = {car1,car2,car3,car4};
        Arrays.sort(cars);


        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i].toString());
            System.out.println("____________________________");
        }
    }


}
