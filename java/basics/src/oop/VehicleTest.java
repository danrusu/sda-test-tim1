package oop;

public class VehicleTest {

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

        Vehicle motorcycle = new Vehicle(
                "Honda",
                270,
                2,
                false
        );

        System.out.println("Initial car: " + car);
        System.out.println("Car name: " + car.getName()); // read
        System.out.println("Car initial price: " + car.getPrice()); // read

        // write / modify
        //car.name = "Audi";  // use a public setter if name needs to be modified

        car.setDiesel(false);
        car.setMaxSpeed(350);
        System.out.println("Modified car: " + car);

        // task:
        // 1. increase car price with 100.000
        car.incrementPrice(100_000);
        System.out.println("Car after first increment: " + car);
        // 2. increase car price with 10.000
        car.incrementPrice(10_000);
        System.out.println("Car after second increment: " + car); // price: 110000
        // car.incrementPrice(-110000);
        // System.out.println("Final car: " + car); // price: 0

        bus.incrementPrice(50000);
        System.out.println(bus);

        // Get class information
        System.out.println("Vehicle full class name: " + car.getClass().getName()); // from an instance of Vehicle
        System.out.println("Vehicle full class name: " + Vehicle.class.getName());  // from Class name

        System.out.println("VehicleTest full class name: " + VehicleTest.class.getName());
        System.out.println("VehicleTest simple class name: " + VehicleTest.class.getSimpleName());

        // get the total price for the car and the bus
        // Hint: create a function that takes two Vehicles and returns the total price.
        // Move this function to the Vehicle class
        int totalPrice = Vehicle.calculateTotalPrice(car, bus);
        System.out.println("car & bus total price: " + totalPrice);
        System.out.println(car.getPrice());

        // static method calls (ClassName.methodName(params))
        Vehicle.message();
        totalPrice = Vehicle.calculateTotalPrice(car, motorcycle);

        System.out.println("car & motorcycle total price: " + totalPrice);
    }

}
