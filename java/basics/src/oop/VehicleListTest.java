package oop;

import java.util.Arrays;
import java.util.List;

public class VehicleListTest {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(
                "Porsche",
                300,
                4,
                true
        );
        Vehicle bus = new Vehicle(
                "Scania",
                130,
                4,
                true
        );

        Vehicle motocicle = new Vehicle(
                "Honda",
                270,
                2,
                false
        );

        Vehicle plane = new Vehicle(
                "Boeing",
                800,
                8,
                false
        );


//        List<Vehicle> newList = new ArrayList<>();
//        newList.add(car);
//        newList.add(bus);
//        newList.add(motocicle);
        List<Vehicle> vehicles = Arrays.asList(car, bus, motocicle, plane);
        car.incrementPrice(100000);
        bus.incrementPrice(50000);
        motocicle.incrementPrice(20000);
        plane.incrementPrice(2_000_000);

        //vehicles.forEach(vehicle -> System.out.println(vehicle));

        System.out.println("Vehicles count: " + vehicles.size());
        int totalPrice = 0;
        for (int index = 0; index < vehicles.size(); index++){
            System.out.println("index: " +  index);
            Vehicle currentVehicle = vehicles.get(index);
            System.out.println(currentVehicle);

            totalPrice += currentVehicle.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
    }
}
