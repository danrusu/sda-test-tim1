package oop;

public class Vehicle {
    // fields - encapsulation - private access modifier
    private String name;
    private int maxSpeed;
    private int wheelsCount;
    private boolean isDiesel;
    private int price;

    // constructor method
    public Vehicle(String name,
                   int maxSpeed,
                   int wheelsCount,
                   boolean isDiesel) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.wheelsCount = wheelsCount;
        this.isDiesel = isDiesel;
        // price is set by default to 0
        this.price = 0;
    }

    // GETTERS - READ OPERATIONS
    // private String name;
    public String getName() {
        return name;
    }

    // private int maxSpeed;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public int getPrice() {
        return price;
    }

    // SETTERS - WRITE OPERATIONS
    // name should not be set after creation
    public void setMaxSpeed(int maxSpeedValue) {
        maxSpeed = maxSpeedValue;
    }

    // METHOD (FUNCTION) SIGNATURE
    // [] = optional
    // [1. access modifier: pubic] optional
    // 2. return type: void (method does not return anything)
    // 3. method name: setDiesel
    // [4. parameters: isDiesel] optional
    public void setDiesel(boolean isDiesel) {
        this.isDiesel = isDiesel;
    }

    // Instance method - needs a Vehicle object to call it
    public void incrementPrice(int priceIncrement) {
        this.price = this.price + priceIncrement;
        //this.price += priceIncrement;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + " | max speed: " + this.maxSpeed
                + " | diesel: " + this.isDiesel
                + " | price: " + this.price;
    }

    // Static method (class method)
    public static void message(){
        System.out.println("message from a static method");
    }

    // Static method (class method)
    // vehicle1, vehicle2 - formal parameters
    // Calling this static function:
    //
    public static int calculateTotalPrice(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getPrice() + vehicle2.getPrice();
    }
}
