package day20constructor_datetime;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {

        //Scanner scan= new Scanner(System.in); // to interact with the user, we have been creating Scanner object

        Car car = new Car();
        System.out.println(car.brand + " , " +car.model + " , " + car.price + " , " + car.engineType + " , " + car.sunRoof);
        System.out.println("car = " + car);  // this gives us reference only if we don't have toString() method in our Car class

        Car toyota = new Car("Auris");
        System.out.println("toyota = " + toyota); // this gives us reference only because toString() is commented out
        System.out.println("toyota.model = " + toyota.model); // Auris


        Car tesla = new Car("Tesla", "S", 72000, 2024, "Electric");
        System.out.println("tesla = " + tesla); // this gives us reference only because toString() is commented out
        System.out.println("car brand = " + tesla.brand);
        System.out.println("tesla.model = " + tesla.model);
        System.out.println("tesla.price = " + tesla.price);
        System.out.println("tesla.year = " + tesla.year);
        System.out.println("tesla.engineType = " + tesla.engineType);



        Car gmc = new Car("GMC", "Yukon", 75000, 2024, true, "Hybrid", true);
        System.out.println("gmc.brand = " + gmc.brand);
        System.out.println("gmc.price = " + gmc.price);
        System.out.println("gmc.airCond = " + gmc.airCond);
        gmc.action();

    }
}
