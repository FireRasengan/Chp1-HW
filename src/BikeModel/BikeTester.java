package BikeModel;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BikeTester {
    public static void main(String[] args) {
        Bike[] bikeList = new Bike[2];

        Bike bike1 = new Bike(2, "Schwinn", 2014);
        Bike bike2 = new Bike(3, "Schwinn", 2023);

        bikeList[0] = bike1;
        bikeList[1] = bike2;

        System.out.println(" Wheels: " + bike2.getWheels() + " Manufacturer: " + bike2.getManufacturer() + " Year: " + bike2.getYear());
        System.out.println(Arrays.toString(bikeList));
        System.out.println(bike1.getWheels() + bike2.getWheels());

        if (bike1.getYear() > bike2.getYear()) {
            System.out.println(bike1.getYear());
        } else {
            System.out.println(bike2.getYear());
        }
    }
}
